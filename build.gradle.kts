plugins {
    id("java")
}

group = "pl.tuso.codibly"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("junit:junit:4.13.1")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}