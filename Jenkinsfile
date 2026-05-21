pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/Dishabm25/survey-app.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

       stage('Docker Build') {
    steps {
        sh 'docker pull eclipse-temurin:17-jdk-alpine'
        sh 'docker build -t survey-app .'
    }

        }
    }

    post {
        success {
            echo "BUILD SUCCESS ✅"
        }
        failure {
            echo "BUILD FAILED ❌"
        }
    }
}
