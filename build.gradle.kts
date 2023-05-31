import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.21"
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.postgresql:postgresql:42.5.1")
    implementation("org.json:json:20220924")
    // https://mvnrepository.com/artifact/javax.xml.bind/jaxb-api
    implementation("javax.xml.bind:jaxb-api:2.3.1")

}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}