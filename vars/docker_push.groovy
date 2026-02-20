def call(String Project, String Image Tag, String DockerHubCredUser) {
withCredentials ([username Password (credentials Id: 'DockerHubCred', passwordVariable: 'DockerHubCredPass', username Variable: 'DockerHubCredUser')])
sh "sudo cker login -u ${DockerHubCredUser} -p ${DockerHubCredPass}"
}
sh "sudo docker push ${DockerHubCredUser}/${Project}:${ImageTag}"
}
