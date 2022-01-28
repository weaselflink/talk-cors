@file:Suppress("PropertyName")

import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val junit_version: String by project
val test_containers_version: String by project

plugins {
    kotlin("jvm")
    id("com.github.ben-manes.versions")
}

group = "talks.cors"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "11"
}
