def call(String repositoryname, String imagename, String tagname){
    withCredentials([usernamePassword(credentialsId: 'docker-token', passwordVariable: 'PASSWORD', usernameVariable: 'USER')]) {
    sh "docker login -u '$USER' -p '$PASSWORD'"
}
sh """
docker push  ${repositoryname}/${imagename}:${tagname}
docker push  ${repositoryname}/${imagename}:latest
"""
}