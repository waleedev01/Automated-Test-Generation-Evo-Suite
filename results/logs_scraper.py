import os
import re

def parse_log_file(file_path):
    data = {
        'Class': None,
        'Algorithm': None,
        'Total Goals': None,
        'Covered Goals': None,
        'Mutation Score': None,
        'Time Taken (s)': None,
        'Generations': None,
        'Statements': None,
        'Run': None
    }

    with open(file_path, 'r') as file:
        content = file.read()

        # Extracting general information
        class_match = re.search(r'Running EvoSuite for (\w+)', content)
        algorithm_match = re.search(r'with (\w+)', content)
        run_match = re.search(r'run(\d+)', file_path)
        data['Class'] = class_match.group(1) if class_match else 'Unknown'
        data['Algorithm'] = algorithm_match.group(1) if algorithm_match else 'Unknown'
        data['Run'] = run_match.group(1) if run_match else 'Unknown'

        # Extracting specific metrics
        data['Total Goals'] = find_match(r'Total number of test goals: (\d+)', content)
        data['Covered Goals'] = find_match(r'Number of covered goals: (\d+)', content)
        data['Mutation Score'] = find_match(r'mutation score: (\d+)%', content)
        time_match = re.search(r'Search finished after (\d+)s', content)
        data['Time Taken (s)'] = time_match.group(1) if time_match else 'N/A'        
        data['Generations'] = find_match(r'(\d+) generations', content)
        data['Statements'] = find_match(r'(\d+) statements', content)

    return data

def find_match(pattern, content):
    match = re.search(pattern, content)
    return match.group(1) if match else 'N/A'

def process_logs(base_directory):
    extracted_data = []
    for dirpath, dirnames, filenames in os.walk(base_directory):
        for filename in filenames:
            if filename.endswith('_execution_log.txt'):
                file_path = os.path.join(dirpath, filename)
                parsed_data = parse_log_file(file_path)
                extracted_data.append(parsed_data)
    return extracted_data

def write_to_csv(data, file_name):
    import csv
    if not data:
        print("No data to write.")
        return

    # Sorting the data
    sorted_data = sorted(data, key=lambda x: (x['Class'], x['Algorithm'], int(x['Run'])))

    # Writing to CSV
    with open(file_name, 'w', newline='', encoding='utf-8') as file:
        writer = csv.DictWriter(file, fieldnames=sorted_data[0].keys())
        writer.writeheader()
        writer.writerows(sorted_data)

# Path to the base directory containing log files
base_directory = '.'

# Process the logs and write to CSV
extracted_data = process_logs(base_directory)
output_csv = 'evosuite_results.csv'
write_to_csv(extracted_data, output_csv)
