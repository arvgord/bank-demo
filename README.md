# Bank application

### Bank application implemented with the onion architecture and simulates a banking application for employees

## Prerequisites

* JDK 17
* Node.js v18.15.0
* docker-compose

## Running Bank application

### Start docker-compose

1. `cd ./bank-demo`
2. `docker-compose up`

### Start bank-demo-server

1. `cd ./bank-demo/bank-demo-server`
2. `./gradlew build`
3. `java -jar ./application/spring-app/build/libs/spring-app.jar`

### Start bank-demo-client

1. `cd ./bank-demo/bank-demo-client`
2. `npm i`
3. `npm run build`
4. `npm start`