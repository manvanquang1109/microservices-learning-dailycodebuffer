FROM adoptopenjdk/openjdk11:alpine-jre
COPY target/*.jar cloud-config-server.jar
EXPOSE 9296
ENTRYPOINT ["java","-jar","/cloud-config-server.jar"]