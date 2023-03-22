pipeline {
    agent any 
    stages {
        stage('Cleaning Stage') { 
            steps {
                echo "entering cleaning stage"
                sh "mvn clean" 
            }
        }
        stage('Testing Stage') { 
            steps {
               echo "entering Testing stage"
               sh "mvn test" 
            }
        }
        stage('Packaging Stage') { 
            steps {
               echo "entering Packaging stage"
               sh "mvn package" 
            }
        }
    }
}
