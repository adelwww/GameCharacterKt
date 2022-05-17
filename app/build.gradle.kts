plugins {

    kotlin("android")

    // Application
    id(libs.plugins.agp.application.get().pluginId)

    // Hilt
    id(libs.plugins.hilt.android.get().pluginId)

    // Kapt
    id("kotlin-kapt")

    // Navigation SafeArgs
    id(libs.plugins.navigation.safeArgs.get().pluginId)
}

android {
    compileSdk = 32

    defaultConfig {
        applicationId = "com.example.gamecharacterkt"
        minSdk = 21
        targetSdk = 32
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(project(":domain"))
    implementation(project(":data"))

    //Coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.1")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.1")

    //Core
    implementation("androidx.core:core-ktx:1.7.0")

    //AppCompat
    implementation("androidx.appcompat:appcompat:1.4.1")

    //Material Design Components
    implementation("com.google.android.material:material:1.6.0")

    //UI Components
    implementation("androidx.constraintlayout:constraintlayout:2.1.3")
    implementation("androidx.legacy:legacy-support-v4:1.0.0")

    // Activity
    val activity_version = "1.4.0"
    implementation("androidx.activity:activity-ktx:$activity_version")

    // fragment
    val fragment_version = "1.4.1"

    implementation("androidx.fragment:fragment-ktx:$fragment_version")

    //viewBinding
    implementation("com.github.kirich1409:viewbindingpropertydelegate-noreflection:1.5.6")

    // Lifecycle
    val lifecycle_version = "2.4.0"

    implementation("androidx.lifecycle:lifecycle-runtime-ktx:$lifecycle_version")

    // | for ViewModel
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version")

    // ViewModel and LiveData
    implementation("androidx.lifecycle:lifecycle-extensions:2.2.0")

    //navigation
    val nav_version = "2.3.5"
    implementation("androidx.navigation:navigation-fragment-ktx:$nav_version")
    implementation("androidx.navigation:navigation-ui-ktx:$nav_version")

    //Glide
    implementation("com.github.bumptech.glide:glide:4.12.0")

    // Hilt
    implementation(libs.hilt)
    kapt("com.google.dagger:hilt-android-compiler:2.40")

    implementation(project(":domain"))
    implementation(project(":data"))

    // UI Components
    implementation(libs.bundles.uiComponents)

    // Core
    implementation(libs.android.core)

    // Activity
    implementation(libs.activity.activity)

    // Fragment
    implementation(libs.fragment.fragment)

    // Lifecycle
    implementation(libs.bundles.lifecycle)

    // Navigation
    implementation(libs.bundles.navigation)

    // Hilt
    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)

    // Glide
    implementation(libs.glide.glide)
}
