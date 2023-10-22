# Bank application

### Bank application implemented with the onion architecture and simulates a banking application for employees

## Prerequisites

* JDK 17
* Node.js v18.15.0
* docker-compose

## Running Bank application
To download GitHub packages to compile the project you need to create a [personal access token](https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/creating-a-personal-access-token)
with **read:packages** access. 
![read_packages.png](read_packages.png)

### Start docker-compose

1. `cd ./bank-demo`
2. `docker-compose up`

### Start bank-demo-server

1. `export USERNAME=GITHUB_USERNAME`
2. `export TOKEN=GITHUB_TOKEN`
3. `cd ./bank-demo/bank-demo-server`
4. `./gradlew build`
5. `java -jar ./application/spring-app/build/libs/spring-app.jar`

### Start bank-demo-client

1. `cd ./bank-demo/bank-demo-client`
2. `npm login --registry=https://npm.pkg.github.com` 
    * `> Username: GITHUB_USERNAME`
    * `> Password: GITHUB_TOKEN`
3. `npm i`
4. `npm run build`
5. `npm start`