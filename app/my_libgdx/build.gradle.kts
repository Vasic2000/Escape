plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "ru.vasic2000.my_libgdx"
    compileSdk = 36

    defaultConfig {
        applicationId = "ru.vasic2000.my_libgdx"
        minSdk = 21
        targetSdk = 36
        versionCode = 2
        versionName = "1.36"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
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
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}