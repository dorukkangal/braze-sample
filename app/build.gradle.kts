plugins {
    id("com.android.application")
    id("kotlin-android")
    id("io.sentry.android.gradle")
}

android {
    compileSdk = 32

    defaultConfig {
        applicationId = "com.braze.sample"

        targetSdk = 32
        minSdk = 21

        versionName = "1.0.0"
        versionCode = 1
    }
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.6.0-alpha01")
    implementation("com.google.android.material:material:1.6.0-beta01")
    implementation("com.appboy:android-sdk-ui:19.0.0")
    implementation("io.sentry:sentry-android:5.7.1")
}
