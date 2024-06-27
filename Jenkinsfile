pipeline {
    agent any
     tools { 
        maven 'Maven-3.9.8' 
        jdk 'JDK-22' 
    }
    stages {
        stage('Build') { 
            steps {
                  sh 'mvn version'
            }
        }
    }
}
