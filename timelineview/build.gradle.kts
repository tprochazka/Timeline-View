plugins {
    alias(libs.plugins.androidLibrary)
}

// This is the library version used when deploying the artifact
version = "1.0.5"
group = "com.github.vipulasri" // Maven Group ID for the artifact

android {
    compileSdk = 36
    namespace = "com.github.vipulasri.timelineview"

    defaultConfig {
        minSdk = 21
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

dependencies {
    implementation(libs.androidxAnnotation)
    testImplementation(libs.junit)
}
