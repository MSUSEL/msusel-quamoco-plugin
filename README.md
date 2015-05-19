# sonar-quamoco-plugin

## Introduction
sonar-qualmoco-plugin is a SonarQube plugin to evaluate the quality of a measured software system using the QUAMOCO quality model.
The Quamoco quality model is an ISO 25010 compliant quality model.
This plugin works with all languages (using the base quamoco model), but specifically for the Java and C# languages the quality model
incorporates more measures based on tools such as PMD and FindBugs.

Beyond the base model, the Java model, and the C# model, we have also included a QMOOD quality model to replace the base model.
We have also included an extended quality model for both Java and C# (extending their models) which includes enhanced security analysis to
meet RMF compliance.

## Goals
* Calculate quality using a Quamoco Quality Model.
* Evaluate the quality grade for any set of quality factors and attributes.
* Create and evalute quality models for the following languages:
 - ABAP
 - C/C++
 - C#
 - Clojure
 - COBOL
 - CSS
 - D
 - Erlang
 - Flex/Action Script
 - Fortran
 - F#
 - Go
 - Groovy
 - Haskell
 - Io
 - Java
 - JavaScript
 - Lisp
 - lua
 - ML
 - Objective-C
 - PHP
 - PL/1
 - PL/SQL
 - Python
 - R
 - RPG
 - Ruby
 - Scala
 - Scheme
 - Swift
 - VB.NET
 - Web/HTML
 - XML
* Extend the Quamoco Quality models to include Code Smells, Antipatterns, and other issues not yet already included to increase their functionality.
* Replace the existing SQALE implementation in SonarQube.
* Collect and analyze data for empirical software engineering research.