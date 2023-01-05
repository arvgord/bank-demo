dependencies {
    implementation(project(":domain"))
    implementation(project(":grpc-controller"))
    implementation(project(":mapping"))
    implementation(project(":repository"))
    implementation(project(":use-case"))
    implementation(project(":use-case-api"))

    implementation("org.flywaydb:flyway-core:${property("flywayCoreVersion")}")

    runtimeOnly("org.postgresql:postgresql:${property("postgresqlVersion")}")
}