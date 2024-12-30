def call(String repositoryname, String imagename, String tagname ){
    sh """
      trivy image --format table -o imagescan.html ${repositoryname}/${imagename}:latest
      cat imagescan.html
    """
}