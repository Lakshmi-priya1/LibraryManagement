pipeline {
    agent any

    environment {
        IMAGE_NAME = "library-management-app"
        REPO_URL = 'https://github.com/Lakshmi-priya1/LibraryManagement.git'
        BRANCH_NAME = 'main'  // Set your branch here
    }

    stages {
        stage('Clone') {
            steps {
                script {
                    // Explicitly checkout the correct branch
                    checkout scm: [
                        $class: 'GitSCM',
                        branches: [[name: "refs/heads/${BRANCH_NAME}"]],
                        userRemoteConfigs: [[url: REPO_URL]]
                    ]
                }
            }
        }

        stage('Build with Maven') {
            steps {
                // Run Maven build
                sh './mvnw clean package -DskipTests'
            }
        }

        stage('Build Docker Image') {
            steps {
                // Build the Docker image
                sh "docker build -t $IMAGE_NAME ."
            }
        }

        stage('Run with Docker Compose') {
            steps {
                // Clean up any running containers before starting new ones
                sh "docker-compose down"
                sh "docker-compose up -d"
            }
        }
    }

    post {
        always {
            echo 'Pipeline completed.'
        }
    }
}

