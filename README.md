## Automated Test Generation Analysis using EvoSuite

### Overview

This project focuses on automated test generation for Java classes using the EvoSuite framework. It encompasses scripts for generating tests, scraping logs for data extraction, and visualizing the performance of different testing algorithms on two specific Java classes - `Triangle` and `SortBubble`.

### Prerequisites

* Java (JDK): Ensure Java and `javac` are installed (Java version 8 or above recommended).
* EvoSuite: `evosuite-1.0.6.jar` and `evosuite-standalone-runtime-1.0.6.jar` should be in the project root directory.
* Python 3: Required for log scraping and visualization scripts.
* External Libraries: Check `requirements.txt` for Python libraries needed for log scraping and generating visualizations.


### File Structure

```plaintext
.
├── README.md
├── SortBubble.class
├── SortBubble.java
├── Triangle.class
├── Triangle.java
├── evosuite-1.0.6.jar
├── evosuite-standalone-runtime-1.0.6.jar
├── generate_tests.sh
│   └── (...)
├── results
│   └── (various test result files and directories)
├── evosuite_results.csv
├── log_scraper.py
└── visualizations
    ├── visualizations.py
    └── visualizations_results
        └── (visualization images)
```


### Usage

#### Test Generation

* **Script** : `generate_tests.sh`
* **Usage** : `./generate_tests.sh ClassName`
* Replace `ClassName` with the name of the class you want to generate tests for, such as `Triangle` or `SortBubble`.
* **Description** : This script uses EvoSuite to generate tests for the specified Java class. It runs tests using two different strategies - `MONOTONIC_GA` and `RANDOM_SEARCH`.

#### Log Scraping

* **Script** : `log_scraper.py`
* **Usage** : Run `python3 log_scraper.py` after test generation.
* **Description** : This script processes log files from test runs and compiles the data into a CSV file (`evosuite_results.csv`).

#### Visualizations

* **Script** : `visualizations.py`
* **Usage** : Run `python3 visualizations.py` after log scraping.
* **Description** : Generates various graphs based on the data extracted from the logs, which are stored in the `visualizations_results` directory.

### Methodology

* The process begins with the generation of test cases using EvoSuite for the given Java classes.
* The generated logs from these tests are then scraped for valuable data using the `log_scraper.py` script.
* Finally, this data is visualized through various graphs using the `visualizations.py` script to analyze the performance of different test generation strategies.

### Results and Conclusions

The results provide insights into the efficiency and effectiveness of different automated test generation strategies. Graphical representations in the `visualizations_results` folder offer a comparative view of the algorithms in terms of coverage, mutation scores, and other vital metrics.
