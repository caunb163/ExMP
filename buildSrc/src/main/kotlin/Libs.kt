object Libs {
    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val material = "com.google.android.material:material:${Versions.material}"
    const val constrainlayout = "androidx.constraintlayout:constraintlayout:${Versions.constrainlayout}"

    const val junit = "junit:junit:${Versions.junit}"
    const val extJunit = "androidx.test.ext:junit:${Versions.extJunit}"
    const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espressoCore}"

    const val koin = "io.insert-koin:koin-core:${Versions.koin}"
    const val koinAndroid = "io.insert-koin:koin-android:${Versions.koin}"
    const val koinNavigation = "io.insert-koin:koin-androidx-navigation:${Versions.koin}"
    const val koinCompat = "io.insert-koin:koin-android-compat:${Versions.koin}"
    const val koinWorkManager = "io.insert-koin:koin-androidx-workmanager:${Versions.koin}"
}

object Deps {
    val core = arrayOf(
        Libs.coreKtx,
        Libs.appcompat,
        Libs.material,
        Libs.constrainlayout
    )

    val test = arrayOf(
        Libs.junit
    )

    val androidTest = arrayOf(
        Libs.extJunit,
        Libs.espressoCore
    )

    val koin = arrayOf(
        Libs.koin,
        Libs.koinAndroid,
        Libs.koinNavigation,
        Libs.koinCompat,
        Libs.koinWorkManager
    )
}