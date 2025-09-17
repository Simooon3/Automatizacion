plugins {
    java
    id("io.freefair.lombok") version "8.0.1"
}

group = "com.tuempresa"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    // Agregar repositorio para WebDriverManager si lo quieres usar
    // gradlePluginPortal() // no necesario aquí
}

val serenityVersion = "3.6.12"
val cucumberVersion = "7.11.1"
val seleniumVersion = "4.20.0"
val webDriverManagerVersion = "5.4.0"

dependencies {
    implementation("net.serenity-bdd:serenity-core:$serenityVersion")
    implementation("net.serenity-bdd:serenity-junit:$serenityVersion")
    implementation("net.serenity-bdd:serenity-cucumber:$serenityVersion")
    implementation("net.serenity-bdd:serenity-screenplay:$serenityVersion")
    implementation("net.serenity-bdd:serenity-screenplay-webdriver:$serenityVersion")

    implementation("org.seleniumhq.selenium:selenium-java:$seleniumVersion")

    // WebDriverManager para manejar drivers automáticamente (opcional pero recomendado)
    implementation("io.github.bonigarcia:webdrivermanager:$webDriverManagerVersion")

    implementation("io.cucumber:cucumber-java:$cucumberVersion")
    implementation("io.cucumber:cucumber-junit:$cucumberVersion")

    testImplementation("junit:junit:4.13.2")
}

tasks.test {
    useJUnit()
    systemProperties.putAll(System.getProperties().mapKeys { it.key.toString() })
}


