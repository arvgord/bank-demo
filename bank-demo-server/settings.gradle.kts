rootProject.name = "bank-demo-server"

pluginManagement {
    val kotlinVersion: String by settings
    val springBootVersion: String by settings
    val springDependencyManagement: String by settings
    plugins {
        kotlin("plugin.jpa") version kotlinVersion
        kotlin("jvm") version kotlinVersion
        kotlin("plugin.spring") version kotlinVersion
        kotlin("kapt") version kotlinVersion
        id("org.springframework.boot") version springBootVersion
        id("io.spring.dependency-management") version springDependencyManagement
    }
    repositories {
        gradlePluginPortal()
    }
}

include(":domain")
include(":grpc-controller")
include(":mapping")
include(":repository")
include(":spring-app")
include(":use-case")
include(":use-case-api")

project(":domain").projectDir = file("application/domain")
project(":grpc-controller").projectDir = file("application/adapter/controller/grpc-controller")
project(":mapping").projectDir = file("application/adapter/mapping")
project(":repository").projectDir = file("application/adapter/repository")
project(":spring-app").projectDir = file("application/spring-app")
project(":use-case").projectDir = file("application/use-case")
project(":use-case-api").projectDir = file("application/use-case-api")