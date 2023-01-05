dependencies {
    implementation(project(":mapping"))
    implementation(project(":domain"))
    implementation(project(":use-case-api"))
    implementation("com.arvgord:bank-demo-api:${property("bankDemoApiVersion")}")
    implementation("io.grpc:grpc-kotlin-stub:${property("grpcKotlinVersion")}")
    implementation("io.github.lognet:grpc-spring-boot-starter:${property("grpcSpringBootStarter")}")
}