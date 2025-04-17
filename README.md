
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
 - Java 24+ with JavaFX, this project is built and tested with Azul's Java distribution with JavaFX.
 - Maven 3.9.0 (use the provided wrapper)

1. Build the application
```
./mvnw verify
```
2. Build for Mac
```
./mvnw -Posx_arm package

./mvnw -Posx_intel package
```
3. Build for Linux (rpm/deb)


```
./mvnw -Plinux_intel_deb package

./mvnw -Plinux_intel_rpm package
```

4. Build for Windows
```
./mvnw -Pwindows package
```

To build rpm, you will need to install rpm-build:
yum install-rpm-build

Assembled distributions located at: `target/jreleaser/assemble/`.
