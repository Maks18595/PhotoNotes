plugins {
    id("com.android.application") version "8.5.2"
    kotlin("android") version "1.9.0"
    kotlin("kapt")
}

android {
    namespace = "com.first.photonotes" // Add this line to specify the namespace
    compileSdk = 34
    viewBinding {
        var enabled = true
    }
        defaultConfig {
        applicationId = "com.first.photonotes"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}

dependencies {
    implementation (libs.material)

    implementation (libs.gson)
    implementation (libs.kotlin.stdlib.v1822)
    implementation(libs.androidx.recyclerview)
    implementation (libs.androidx.room.runtime)
    // AndroidX dependencies
    implementation(libs.androidx.activity.ktx)
    implementation(libs.androidx.lifecycle.viewmodel.ktx.v261)
    implementation(libs.androidx.lifecycle.livedata.ktx.v285)
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.room.common)
    implementation(libs.androidx.room.ktx)

    // Compose dependencies
    implementation(libs.ui)
    implementation(libs.androidx.material3.v100)
    implementation(libs.ui.tooling.preview)

    // Glide
    implementation(libs.glide)

    // UI Tooling
    implementation(libs.ui.tooling)

    // Lifecycle and ViewModel
    implementation(libs.androidx.lifecycle.runtime.ktx.v251)
    implementation(libs.androidx.activity.compose.v170)

    // Kotlin standard library
    implementation(libs.kotlin.stdlib.v1810)
    implementation(libs.androidx.recyclerview)

    // Test dependencies
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}
