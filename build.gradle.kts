
allprojects {
    repositories {
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}

plugins {
    kotlin("multiplatform") apply false
    kotlin("android") apply false
    id("com.android.application") apply false
    id("com.android.library") apply false
    id("org.jetbrains.compose") apply false
    id("com.github.node-gradle.node") version "7.1.0"
}

configurations.all {
    resolutionStrategy {
        force("org.jetbrains.kotlin-wrappers:kotlin-nodejs:20.0.0")
    }
}

node {
    version = "18.20.4"
    npmVersion = "10.8.1"
    download = true
    workDir = file("$projectDir/.gradle/nodejs")
}