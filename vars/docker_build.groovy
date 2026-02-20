def call(String project, String imageTag, String DockerHubUser) {
sh "sudo docker build -t ${DockerHubUser}/${project}:${imageTag} ."
}
