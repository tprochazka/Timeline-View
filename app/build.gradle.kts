plugins {
    alias(libs.plugins.androidApplication)
}

android {
    compileSdk = 35
    buildToolsVersion = "35.0.0"

    defaultConfig {
        applicationId = "com.github.vipulasri.timelineview.sample"
        minSdk = 21
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation(fileTree("libs") { include("*.jar") })
    testImplementation(libs.junit4)
    implementation(libs.supportAppcompat)
    implementation(libs.supportDesign)
    implementation(libs.supportCardview)
    implementation(libs.butterknife)
    annotationProcessor(libs.butterknifeCompiler)

    //implementation(project(":timelineview"))
    implementation(libs.timelineView)
}
