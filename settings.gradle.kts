pluginManagement {
    repositories {
        google()
        jcenter()
        gradlePluginPortal()
        mavenCentral()
    }

}
rootProject.name = "Surf"

enableFeaturePreview("GRADLE_METADATA")

include(":androidApp")
include(":shared")
include(":backend")
