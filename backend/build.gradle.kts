plugins {
    id("kotlin-platform-jvm")
    application
}

dependencies {
    implementation(project(":shared"))
}

application {
    mainClass.set("ServerKt")
}
