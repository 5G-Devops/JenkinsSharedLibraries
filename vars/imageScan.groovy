def call(String repositoryname, String imagename, String tagname ){
    sh """
      trivy image ${repositoryname}/${imagename} ${repositoryname}/${imagename}:latest > scan.txt
      cat scan.txt
    """
}