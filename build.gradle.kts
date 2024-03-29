plugins {
    java
    application
}

repositories {
    jcenter()
}

dependencies {
    implementation("com.google.guava:guava:28.0-jre")
    testImplementation("junit:junit:4.12")
}

application {
    mainClassName = "interview.chessroute.App"
}
