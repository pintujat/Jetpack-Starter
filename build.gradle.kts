plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.compose) apply false
    id("com.google.devtools.ksp") version "2.3.5" apply false // Check GitHub for latest KSP version
    id("com.google.dagger.hilt.android") version "2.59.1" apply false

}