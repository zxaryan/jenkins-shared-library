pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo "Building new ${env.BRANCH_NAME}"
            }
        }

        stage('Test') {
            steps {
                echo "Testing ${env.BRANCH_NAME}"
            }
        }
    }
}