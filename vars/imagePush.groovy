def call(String repositoryname, String imagename, String tagname){
    withCredentials([usernamePassword(credentialsId: 'docker', passwordVariable: 'PASSWORD', usernameVariable: 'USER')]) {
    sh "docker login -u '$USER' -p '$PASSWORD'"
}
sh """
docker push ${repositoryname}/${imagename}  ${repositoryname}/${imagename}:${tagname}
docker push ${repositoryname}/${imagename}  ${repositoryname}/${imagename}:latest
"""
}