FROM adoptopenjdk/openjdk11:alpine-jre
COPY target/*.jar department-service.jar
EXPOSE 9001
ENTRYPOINT ["java","-jar","/department-service.jar"]