pipeline {
    agent any

    stages {
        // Stage to checkout the code from GitHub
        stage('Checkout') {
            steps {
                checkout scm: [
                    $class: 'GitSCM', 
                    branches: [[name: '*/main']], // Adjust the branch name as per your requirement
                    userRemoteConfigs: [[url: 'https://github.com/Lakshmi-priya1/LibraryManagement.git']]
                ]
            }
        }

        // Stage to build the project (add your build commands here)
        stage('Build') {
            steps {
                echo 'Building the project...'
                // Example build command for Maven (adjust as per your setup)
                sh './mvnw clean package -DskipTests'
            }
        }

        // Stage to build a Docker image for the project
        stage('Build Docker Image') {
            steps {
                echo 'Building Docker Image...'
                // Example of building Docker image using Dockerfile
                sh 'docker build -t library-management-app .'
            }
        }

        // Stage to start the application with Docker Compose
        stage('Start with Docker Compose') {
            steps {
                echo 'Starting application with Docker Compose...'
                // Ensure previous containers and volumes are removed before starting new ones
                sh 'docker-compose down -v --remove-orphans'  // Stops and removes containers and volumes
                sh 'docker-compose up -d'  // Starts containers in detached mode
            }
        }

        // Stage to run tests (if any)
        stage('Test') {
            steps {
                echo 'Running tests...'
                // Add your testing steps here
                // For example: sh 'mvn test' or any other testing tool
            }
        }

        // Stage to stop Docker containers after tests (if needed)
        stage('Stop Containers') {
            steps {
                echo 'Stopping Docker containers...'
                // Command to stop containers using Docker Compose
                sh 'docker-compose down -v --remove-orphans'
            }
        }
    }

    // Post actions (cleanup or notification after pipeline run)
    post {
        always {
            echo 'Cleaning workspace...'
            cleanWs()  // Cleans up the workspace after the pipeline run
        }

        success {
            echo 'Pipeline completed successfully!'
        }

        failure {
            echo 'Pipeline failed. Please check the logs.'
        }
    }
}
