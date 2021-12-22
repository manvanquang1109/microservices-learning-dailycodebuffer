FROM adoptopenjdk/openjdk11:alpine-jre
COPY target/*.jar user-service.jar
EXPOSE 9002
ENTRYPOINT ["java","-jar","/user-service.jar"]