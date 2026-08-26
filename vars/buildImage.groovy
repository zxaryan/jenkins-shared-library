#!/user/bin/env groovy

def call(){
    echo "building the docker image..."
    withCredentials([usernamePassword(credentialId: 'docker-hub repo', passwordVariable: 'PASS', usernameVariable: 'USER')])
    sh 'docker build -t aryandockerdev/demo-app-jenkins:jma-1.1'
    sh 'echo $PASS | docker login -u $USER --password-stdin'
    sh 'docker push aryandockerdev/demo-app-jenkins:jma-1.1'
}
