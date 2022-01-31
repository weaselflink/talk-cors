@file:Suppress("LocalVariableName")

rootProject.name = "talk-cors"

pluginManagement {
    val kotlin_version: String by settings
    val spring_boot_version: String by settings
    val spring_dependency_version: String by settings
    val versions_version: String by settings
    plugins {
        id("org.springframework.boot") version spring_boot_version
        id("io.spring.dependency-management") version spring_dependency_version
        kotlin("jvm") version kotlin_version
        kotlin("plugin.spring") version kotlin_version
        id("com.github.ben-manes.versions") version versions_version
    }
}
