 def call(String repoUrl, String branch){
    sh "git clone ${repoUrl} ${workingDir}"
    sh "git checkout ${branch}"
    return workingDir
 }
