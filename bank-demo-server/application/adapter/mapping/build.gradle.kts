plugins {
    kotlin("kapt")
}

dependencies {
    implementation(project(":domain"))
    implementation("org.mapstruct:mapstruct:${property("mapstructVersion")}")
    implementation("com.arvgord:bank-demo-api:${property("bankDemoApiVersion")}")
    implementation("io.grpc:grpc-protobuf:${property("grpcProtobufVersion")}")
    kapt("no.entur.mapstruct.spi:protobuf-spi-impl:${property("mapstructProtobufSpi")}")
    kapt("org.mapstruct:mapstruct-processor:${property("mapstructVersion")}")
}