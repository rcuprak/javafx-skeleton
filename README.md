
# javafx-skeleton ![Building](https://github.com/rcuprak/javafx-skeleton/actions/workflows/maven.yml/badge.svg)

This is an example project demonstrating how to easily build, bundle and distribute a [JavaFX](https://openjfx.io) desktop application.
The output of this project are native installers which install the application the requisite pieces of the JDK.

This example project produces the following bundles:
- Windows (x86_64)
- Linux (x86_64)
- MacOS X (x86_64)
- MacOS X (Apple Silicon)

### Building

**Requirements**
 - Java 22+
 - Maven 3.9.0 (use the provided wrapper)

1. Build the application
```
./mvnw verify
```
2. Copy all dependencies
```
./mvnw -Pjars
```
3. Provision all JDKS
```
./mvnw -Pjdks
```
4. Assemble Jlink and Jpackage (must be run on each target OS)
```
./mvnw -Passemble
```

Assembled distributions located at: `target/jreleaser/assemble/`.
