def call(String repositoryname, String imagename, String tagname ){
    sh """
      trivy image ${repositoryname}/${imagename}:latest > scan.txt
      cat scan.txt
    """
}