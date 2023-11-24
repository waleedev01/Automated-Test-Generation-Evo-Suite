#!/bin/bash

# Check if a class name is provided
if [ "$#" -ne 1 ]; then
    echo "Usage: $0 <ClassName>"
    exit 1
fi

CLASS_NAME=$1

# Define the number of repetitions
NUM_REPETITIONS=10

# Define the strategies to use based on the available algorithms in EvoSuite
STRATEGIES=("CELLULAR_GA")

# Create a main results directory if it doesn't exist
mkdir -p results

# Create a directory for the class inside the results folder
CLASS_DIR="results/${CLASS_NAME}"
mkdir -p "${CLASS_DIR}"

for STRATEGY in "${STRATEGIES[@]}"; do
    # Create a directory for each strategy inside the class directory
    STRATEGY_DIR="${CLASS_DIR}/${STRATEGY}"
    mkdir -p "${STRATEGY_DIR}"

    for (( i=1; i<=NUM_REPETITIONS; i++ )); do
        # Create a directory for each repetition within the strategy directory
        REP_DIR="${STRATEGY_DIR}/run${i}"
        mkdir -p "${REP_DIR}"

        # Define the log file within the repetition directory
        LOG_FILE="${REP_DIR}/${CLASS_NAME}_${STRATEGY}_execution_log.txt"

        echo "Compiling ${CLASS_NAME}.java..." >> "${LOG_FILE}"
        javac "${CLASS_NAME}.java" >> "${LOG_FILE}" 2>&1

        echo "Running EvoSuite for ${CLASS_NAME} with ${STRATEGY}..." >> "${LOG_FILE}"
        java -jar evosuite-1.0.6.jar -projectCP . -class "${CLASS_NAME}" -criterion branch -Dalgorithm="${STRATEGY}" >> "${LOG_FILE}" 2>&1

        if [ -f "evosuite-tests/${CLASS_NAME}_ESTest.java" ]; then
            echo "Compiling generated test class..." >> "${LOG_FILE}"
            javac -cp ".:evosuite-standalone-runtime-1.0.6:evosuite-1.0.6.jar:evosuite-tests" "evosuite-tests/${CLASS_NAME}_ESTest.java" >> "${LOG_FILE}" 2>&1

            echo "Running JUnit tests..." >> "${LOG_FILE}"
            java -cp ".:evosuite-standalone-runtime-1.0.6:evosuite-1.0.6.jar:evosuite-tests" org.junit.runner.JUnitCore "${CLASS_NAME}_ESTest" >> "${LOG_FILE}" 2>&1
        else
            echo "No test class generated for ${CLASS_NAME} with ${STRATEGY}" >> "${LOG_FILE}"
        fi

        # Move the evosuite-report and evosuite-tests folders to the repetition directory
        mv evosuite-report "${REP_DIR}/report"
        mv evosuite-tests "${REP_DIR}/tests"

        echo "Results and logs for ${STRATEGY} run ${i} moved to ${REP_DIR}"
    done
done
