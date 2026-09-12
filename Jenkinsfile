pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo "Building ${env.BRANCH_NAME}"
                echo "Testing CI Automation..."
            }
        }

        stage('Test') {
            steps {
                echo "Testing ${env.BRANCH_NAME}"
            }
        }
    }
}