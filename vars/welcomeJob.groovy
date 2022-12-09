def call() {
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
