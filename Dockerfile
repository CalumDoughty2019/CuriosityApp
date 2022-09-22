FROM openjdk:11
COPY target/classes/ /tmp
WORKDIR /tmp
CMD java org.rover.Main


### Build the application
#FROM    maven:3.8.5-jdk-11
#ARG     JAR_FILE=target/*.jar
#
#RUN     mkdir /docker
### Set the current woking directory inside this image
#WORKDIR /docker
#
#COPY    pom.xml .
#RUN     mvn dependency:resolve
#
#COPY    src .
#
#RUN     mvn clean verify
#
##CMD     java src.main.java.org.rover.Main
