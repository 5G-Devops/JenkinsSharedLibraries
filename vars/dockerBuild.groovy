def call(String repositoryname, String imagename, String tagname ){
    sh """
      docker build -t ${repositoryname}/${imagename} .
      docker image tag ${repositoryname}/${imagename}  ${repositoryname}/${imagename}:${tagname}
      docker image tag ${repositoryname}/${imagename}  ${repositoryname}/${imagename}:latest
    """
}