plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.lab1"
    compileSdk = 34

    packagingOptions {
        resources.excludes.add("META-INF/*")
        resources.excludes.add("NOTICES/libcore-NOTICES.txt")
    }

    defaultConfig {
        applicationId = "com.example.lab1"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        debug {
            matchingFallbacks += listOf("release")
        }
        release {

            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
//        isCoreLibraryDesugaringEnabled = true
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.constraintlayout)
    implementation(libs.ext.junit)
    implementation(libs.espresso.core)
    implementation(libs.junit.jupiter)
    testImplementation ("junit:junit:4.13.2")
    testImplementation(" org.robolectric:robolectric:4.8")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation ("androidx.test.ext:junit:1.1.5")
}