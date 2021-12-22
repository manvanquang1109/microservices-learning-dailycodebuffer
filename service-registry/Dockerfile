FROM adoptopenjdk/openjdk11:alpine-jre
COPY target/*.jar service-registry.jar
EXPOSE 8761
ENTRYPOINT ["java","-jar","/service-registry.jar"]