pipeline {
    agent any 
    stages {
        stage('Cleaning Stage') { 
            steps {
                 "mvn clean" 
            }
        }
        stage('Testing Stage') { 
            steps {
               "mvn test" 
            }
        }
        stage('Packaging Stage') { 
            steps {
               "mvn package" 
            }
        }
    }
}
