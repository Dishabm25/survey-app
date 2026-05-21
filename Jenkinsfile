pipeline {
    agent any

    tools {
        maven 'Maven3'
    }

    stages {

        stage('Checkout Code') {
            steps {
                git branch: 'main', url: 'https://github.com/Dishabm25/survey-app.git'
            }
        }

        stage('Build with Maven') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Run Tests') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t survey-app:latest .'
            }
        }

        stage('Run Container') {
            steps {
                sh 'docker run -d -p 8085:8085 --name survey-app-container survey-app:latest || true'
            }
        }
    }

    post {
        success {
            echo 'BUILD SUCCESS ✅ Survey App deployed successfully'
        }

        failure {
            echo 'BUILD FAILED ❌ Check logs'
        }
    }
}
