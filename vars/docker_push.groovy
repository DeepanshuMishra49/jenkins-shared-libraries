def call(String project, String imageTag, String dockerHubUser) {
withCredentials ([usernamePassword (credentialsId: 'DockerHubCred', passwordVariable: 'DockerHubCredPass', usernameVariable: 'DockerHubCredUser')])
sh "sudo docker login -u ${DockerHubCredUser} -p ${DockerHubCredPass}"
sh "sudo docker push ${DockerHubCredUser}/${Project}:${ImageTag}"
}
