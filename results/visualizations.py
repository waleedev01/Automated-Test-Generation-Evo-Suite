import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns

# Load the CSV data into a DataFrame
file_path = 'evosuite_results.csv'  # Update the file path if necessary
data = pd.read_csv(file_path)

# Visualization 1: Mutation Score across Classes and Algorithms
plt.figure(figsize=(10, 6))
sns.barplot(x='Class', y='Mutation Score', hue='Algorithm', data=data)
plt.title('Mutation Score across Classes and Algorithms')
plt.ylabel('Mutation Score')
plt.xlabel('Class')
plt.savefig('visualizations_results/mutation_score_classes_algorithms.png')

# Visualization 2: Time Taken for each Run across Classes and Algorithms
plt.figure(figsize=(12, 7))
sns.lineplot(x='Run', y='Time Taken (s)', hue='Algorithm', style='Class', data=data)
plt.title('Time Taken for each Run across Classes and Algorithms')
plt.ylabel('Time Taken (s)')
plt.xlabel('Run')
plt.savefig('visualizations_results/time_taken_each_run.png')

# Visualization 3: Goals Coverage Ratio across Classes and Algorithms
plt.figure(figsize=(10, 6))
data['Coverage Ratio'] = data['Covered Goals'] / data['Total Goals']
sns.boxplot(x='Class', y='Coverage Ratio', hue='Algorithm', data=data)
plt.title('Goals Coverage Ratio across Classes and Algorithms')
plt.ylabel('Coverage Ratio')
plt.xlabel('Class')
plt.savefig('visualizations_results/coverage_ratio_classes_algorithms.png')

# Visualization 4: Generations across Classes and Algorithms
plt.figure(figsize=(10, 6))
sns.violinplot(x='Class', y='Generations', hue='Algorithm', data=data)
plt.title('Generations across Classes and Algorithms')
plt.ylabel('Generations')
plt.xlabel('Class')
plt.savefig('visualizations_results/generations_classes_algorithms.png')

# File paths for the saved images
image_paths = {
    'mutation_score': 'visualizations_results/mutation_score_classes_algorithms.png',
    'time_taken': 'visualizations_results/time_taken_each_run.png',
    'coverage_ratio': 'visualizations_results/coverage_ratio_classes_algorithms.png',
    'generations': 'visualizations_results/generations_classes_algorithms.png'
}

image_paths
