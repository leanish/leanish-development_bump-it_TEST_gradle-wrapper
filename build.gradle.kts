plugins {
    java
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

// No registry dependencies: this fixture isolates the Gradle wrapper update.
val fixtureTest by tasks.registering(JavaExec::class) {
    dependsOn(tasks.testClasses)
    classpath = sourceSets.test.get().runtimeClasspath
    mainClass.set("io.github.leanish.fixture.GreetingTest")
}

tasks.check {
    dependsOn(fixtureTest)
}

tasks.test {
    // The dependency-free test runs in fixtureTest rather than a JUnit engine.
    failOnNoDiscoveredTests = false
}
