def call(String repositoryname, String imagename, String tagname){
    sh """
    docker rmi ${repositoryname}/${imagename}:${tagname}
    docker rmi ${repositoryname}/${imagename}:latest
    """
}