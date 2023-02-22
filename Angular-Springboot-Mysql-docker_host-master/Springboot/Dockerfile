FROM openjdk:17-jdk-slim-buster
VOLUME /tmp
EXPOSE 8080
ADD /build/libs/demo-0.0.1-SNAPSHOT.jar demo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","demo-0.0.1-SNAPSHOT.jar"]

