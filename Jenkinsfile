pipeline {
    agent any

    tools {
        maven 'M3'   // Name of Maven installation in Jenkins (configure in Jenkins → Global Tool Configuration)
        
    }

    stages {
        stage('Checkout') {
            steps {
                echo 'Pipeline started successfully!'
                git branch: 'main',
                    url: 'https://github.com/Yogs253/SampleMavenTestProject.git'
            }
        }

        stage('Build') {
            steps {
                echo 'Building project...'
                //sh 'mvn -Dmaven.test.failure.ignore=true clean package'
            }
        }

        stage('Test') {
            steps {
                 echo 'Running tests...'
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }

        
    }

    post {
        success {
            echo "✅ Build succeeded!"
        }
        failure {
            echo "❌ Build failed!"
        }
    }
}
