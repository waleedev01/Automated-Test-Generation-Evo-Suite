import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns

# Load the CSV data into a DataFrame
data = pd.read_csv('evosuite_results.csv')

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

# Visualization 4: Statements across Classes and Algorithms
plt.figure(figsize=(10, 6))
sns.violinplot(x='Class', y='Statements', hue='Algorithm', data=data)
plt.title('Statements across Classes and Algorithms')
plt.ylabel('Statements')
plt.xlabel('Class')
plt.savefig('visualizations_results/statements_classes_algorithms.png')


# Visualization 6: Mutation Score over Runs
plt.figure(figsize=(12, 7))
sns.lineplot(x='Run', y='Mutation Score', hue='Algorithm', style='Class', data=data)
plt.title('Mutation Score over Runs')
plt.ylabel('Mutation Score')
plt.xlabel('Run')
plt.savefig('visualizations_results/mutation_score_over_runs.png')

# Visualization 7: Total Goals vs Covered Goals
plt.figure(figsize=(10, 6))
data['Uncovered Goals'] = data['Total Goals'] - data['Covered Goals']
data_melted = data.melt(id_vars=['Class', 'Algorithm', 'Run'], value_vars=['Covered Goals', 'Uncovered Goals'])
sns.barplot(x='Class', y='value', hue='variable', data=data_melted)
plt.title('Total Goals vs Covered Goals')
plt.ylabel('Number of Goals')
plt.xlabel('Class')
plt.savefig('visualizations_results/total_vs_covered_goals.png')

# Visualization 8: Distribution of Time Taken
plt.figure(figsize=(10, 6))
sns.histplot(data=data, x='Time Taken (s)', hue='Algorithm', multiple='stack')
plt.title('Distribution of Time Taken by Algorithms')
plt.xlabel('Time Taken (s)')
plt.ylabel('Frequency')
plt.savefig('visualizations_results/time_taken_distribution.png')


# Visualization 9: Algorithm Performance Comparison
plt.figure(figsize=(12, 7))
sns.scatterplot(x='Time Taken (s)', y='Mutation Score', hue='Algorithm', style='Class', data=data)
plt.title('Mutation Score vs Time Taken for Each Algorithm')
plt.xlabel('Time Taken (s)')
plt.ylabel('Mutation Score')
plt.savefig('visualizations_results/performance_comparison.png')

# Visualization 10: Run-to-Run Variability Analysis
plt.figure(figsize=(12, 7))
sns.boxplot(x='Algorithm', y='Mutation Score', data=data)
plt.title('Mutation Score Variability Across Runs')
plt.xlabel('Algorithm')
plt.ylabel('Mutation Score')
plt.savefig('visualizations_results/run_to_run_variability.png')

# Visualization 11: Goal Coverage Efficiency
plt.figure(figsize=(12, 7))
data['Coverage Efficiency'] = data['Covered Goals'] / data['Total Goals']
sns.barplot(x='Algorithm', y='Coverage Efficiency', hue='Class', data=data)
plt.title('Goal Coverage Efficiency by Algorithm')
plt.xlabel('Algorithm')
plt.ylabel('Coverage Efficiency')
plt.savefig('visualizations_results/goal_coverage_efficiency.png')

