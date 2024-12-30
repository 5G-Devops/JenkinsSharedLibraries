def call(String repositoryname, String imagename, String tagname){
  /*  withCredentials([usernamePassword(credentialsId: 'docker-token', passwordVariable: 'PASSWORD', usernameVariable: 'USER')]) {
    sh "docker login -u '$USER' -p '$PASSWORD'"
} */
withDockerRegistry(credentialsId: 'docker-token', toolName: 'docker') {
    sh """
     docker push  ${repositoryname}/${imagename}:${tagname}
     docker push  ${repositoryname}/${imagename}:latest
     """
}

}