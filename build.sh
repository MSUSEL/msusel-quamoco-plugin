#!/bin/sh

mvn clean
mvn package -Dmaven.test.skip=true org.sonarsource.sonar-packaging-maven-plugin:sonar-packaging-maven-plugin:1.15:sonar-plugin

cp ./target/quamoco-plugin-1.1.jar /opt/sonarqube-5.2/extensions/plugins
cp ./target/quamoco-plugin-1.1.jar /opt/sonarqube-5.6/extensions/plugins
