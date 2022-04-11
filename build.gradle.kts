buildscript {
    repositories {
        google()
        mavenCentral()
        maven(url = "https://appboy.github.io/appboy-android-sdk/sdk")
    }

    dependencies {
        classpath("com.android.tools.build:gradle:7.1.3")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.20")
        classpath("io.sentry:sentry-android-gradle-plugin:3.0.0")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven(url = "https://appboy.github.io/appboy-android-sdk/sdk")
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
