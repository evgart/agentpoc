### Docker build

 `dist` folder should contain `linux-amd64.tgz` file with CryptoPro installer.  
 To skip it, just comment lines from Dockerfile

    docker build -f ./docker/Dockerfile . --tag  agentpoc-back-end:1
    
### Docker run

    docker run -d --publish 8082:8082 --name agentpoc-back-end agentpoc:1  
    docker run -d --publish 8082:8082 agentpoc-back-end:1  

### Docker remove|stop

    docker rm --force agentpoc-back-end
    docker stop 