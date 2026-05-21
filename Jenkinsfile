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
            emailext(
                to: 'dishamgowda20052@gmail.com',
                subject: "✔ SUCCESS: Survey App Build Passed",
                body: """
Hello,

Your Jenkins Pipeline has SUCCESSFULLY completed.

✔ Project: Survey App
✔ Status: SUCCESS
✔ Build Number: ${env.BUILD_NUMBER}
✔ Job: ${env.JOB_NAME}

Docker image built successfully.

-- Jenkins CI/CD System
"""
            )
        }

        failure {
            emailext(
                to: 'dishamgowda20052@gmail.com',
                subject: "❌ FAILED: Survey App Build Failed",
                body: """
Hello,

Your Jenkins Pipeline has FAILED.

❌ Project: Survey App
❌ Status: FAILURE
✔ Build Number: ${env.BUILD_NUMBER}
✔ Job: ${env.JOB_NAME}

Please check Jenkins logs.

-- Jenkins CI/CD System
"""
            )
        }
    }
}
