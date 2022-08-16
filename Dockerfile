FROM java:11
ADD build/libs/*.jar docker-sample.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/docker-sample.jar"]