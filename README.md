# msusel-quamoco-plugin

## Introduction
msusel-qualmoco-plugin is a SonarQube plugin to evaluate the quality of a measured software system using the QUAMOCO quality model.
The Quamoco quality model is an ISO 25010 compliant quality model.
This plugin works with all languages (using the base quamoco model), but specifically for the Java and C# languages the quality model
incorporates more measures based on tools such as PMD and FindBugs.

## Installing Maven

This project uses the Maven wrapper so that you do not need to install maven manually.
The first time you go to build this project, simply execute the following command:

```
./mvnw clean install -Dmaven.test.skip=true
```
or for windows:
```
.\mvnw.cmd clean package -Dmaven.test.skip=true
```

## Building

This project can be built using the following command:

```
./mvnw clean package -Dmaven.test.skip=true
```

This project can be compile, tested, or packaged with the following commands:

```
./mvnw clean compile
./mvnw clean test
./mvnw clean package
```