# sonar-quamoco-plugin

## Introduction
sonar-qualmoco-plugin is a SonarQube plugin to evaluate the quality of a measured software system using the qualmoco quality model.
The Quamoco quality model is an ISO 25010 compliant quality model.
This plugin works with all languages (using the base quamoco model), but specifically for the Java and C# languages the quality model
incorporates more measures based on tools such as PMD and FindBugs.

Beyond the base model, the Java model, and the C# model, we have also included a QMOOD quality model to replace the base model.
We have also included an extended quality model for both Java and C# (extending their models) which includes enhanced security analysis to
meet RMF compliance.