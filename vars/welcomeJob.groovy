def call() {
 post {
        success {
            bat 'echo success'
        }
        failure {
            bat 'echo fail'
        }
        unstable {
            bat 'echo unstable'
        }
    }
}
