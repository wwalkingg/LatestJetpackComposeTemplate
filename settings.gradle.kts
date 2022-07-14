pluginManagement {
    plugins{
        id("com.android.application") version "7.4.0-alpha08"
        id("com.android.library") version "7.4.0-alpha08"
        id("org.jetbrains.kotlin.android") version "1.7.0"
    }
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "LatestJetpackComposeTemplate"
include(":app")
