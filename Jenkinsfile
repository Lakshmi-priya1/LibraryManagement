pipeline {
    agent any

    environment {
        IMAGE_NAME = "library-management-app"
    }

    stages {
        stage('Clone') {
            steps {
                git 'https://github.com/Lakshmi-priya1/LibraryManagement.git'
            }
        }

        stage('Build with Maven') {
            steps {
                sh './mvnw clean package -DskipTests'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh "docker build -t $IMAGE_NAME ."
            }
        }

        stage('Run with Docker Compose') {
            steps {
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
