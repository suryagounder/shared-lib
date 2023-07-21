 def call(repoUrl, branch){
    sh "git clone ${repoUrl} ${workingDir}"
    sh "git checkout ${branch}"
    return workingDir
 }

