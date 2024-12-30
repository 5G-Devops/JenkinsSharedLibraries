def call(String repositoryname, String imagename, String tagname ){
    sh """
      # trivy image ${repositoryname}/${imagename}:latest > scan.txt
      trivy image --format table -o imagescan.txt ${repositoryname}/${imagename}:latest
      cat imagescan.txt
    """
}