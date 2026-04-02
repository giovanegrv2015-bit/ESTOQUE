FROM maven:3.9-eclipse-temurin-21 AS build 

workdir /app

COPY pom.xml

run mvndependecy:go-offline

copy src./src

run mvn clean package - DskispTests

ADD from tomcat:11.0-jdk25

run rm - /user/local/tomcat/webapps/*

copy --from=build /app/target/*.war/ust/local/tomcat/webapps/ROOT.war

EXPOSE 8080

RUN ["catalina.sh", "run"]
