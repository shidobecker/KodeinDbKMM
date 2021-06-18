plugins {
    id("com.android.application")
    kotlin("android")
}
val coroutinesVersion = "1.4.3"

dependencies {
    implementation(project(":shared"))
    implementation(SupportLibraries.design)
    implementation(SupportLibraries.appcompat)
    implementation(SupportLibraries.constraintLayout)

    implementation(Libraries.ktxCore)
    implementation(Libraries.ktxFragment)
    implementation(JetPackLibraries.lifecycleViewModelKtx)
    implementation(JetPackLibraries.lifecycleLivedataKtx)
    implementation(Libraries.koinAndroid)
    implementation(Libraries.koinViewModel)

    implementation("androidx.core:core-ktx:1.3.1")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutinesVersion")


}

android {
    compileSdkVersion(30)
    defaultConfig {
        applicationId = "br.com.shido.kodeindb.android"
        minSdkVersion(21)
        targetSdkVersion(30)
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}




object Libraries {
    object Versions {
        //Android
        const val ktx = "1.3.2"
        const val ktxFragment = "1.2.5"
        const val kotlinVersion = "1.4.0"

        const val coroutinesVersion = "1.4.3"

        //DI
        const val koin = "2.0.1"

        const val viewBindingDelegate = "1.4.5"

    }

    //Kotlin
    const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlinVersion}"
    const val kotlinCoroutines =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutinesVersion}"
    const val androidCoroutines =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutinesVersion}"


    const val ktxCore = "androidx.core:core-ktx:${Versions.ktx}"
    const val ktxFragment = "androidx.fragment:fragment-ktx:${Versions.ktxFragment}"

    //DI
    const val koinAndroid = "org.koin:koin-android:${Versions.koin}"
    const val koinViewModel = "org.koin:koin-androidx-viewmodel:${Versions.koin}"
}


object JetPackLibraries {
    object Versions {
        const val lifecycle = "2.1.0"
        const val navigation = "2.3.1"
        const val workManager = "2.2.0"
    }

    //Lifecycle
    const val lifecycleExtensions = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
    const val lifecycleCompiler = "androidx.lifecycle:lifecycle-compiler:${Versions.lifecycle}"
    const val lifecycleViewModelKtx =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
    const val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:2.2.0-rc03"
    const val lifecycleLivedataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:2.2.0-rc03"

    //Navigation
    const val navigationFragment =
        "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
    const val navigationUi = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"

}


object SupportLibraries {
    private object Versions {
        //Support Library
        const val appcompat = "1.2.0"
        const val materialDesign = "1.3.0"
        const val cardView = "1.0.0"
        const val recyclerView = "1.0.0"
        const val constraintLayout = "2.0.4"
    }

    const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val design = "com.google.android.material:material:${Versions.materialDesign}"
    const val cardView = "androidx.cardview:cardview:${Versions.cardView}"
    const val recyclerView = "androidx.recyclerview:recyclerview:${Versions.recyclerView}"
    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
}

