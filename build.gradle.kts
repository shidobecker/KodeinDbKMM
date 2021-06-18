buildscript {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
        jcenter()

    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.10")
        classpath("com.android.tools.build:gradle:7.0.0-beta03")


    }
}

allprojects {
    repositories {
        google()
        jcenter()
        mavenCentral()

        maven("https://dl.bintray.com/kodein-framework/Kodein-DB")
        maven("https://jitpack.io")

    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}