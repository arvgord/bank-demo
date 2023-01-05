plugins {
    kotlin("plugin.jpa")
    kotlin("kapt")
}

dependencies {
    implementation(project(":domain"))
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.mapstruct:mapstruct:${property("mapstructVersion")}")
    kapt("org.mapstruct:mapstruct-processor:${property("mapstructVersion")}")
    compileOnly("org.hibernate:hibernate-jpamodelgen:${property("jpaModelGenVersion")}")
}