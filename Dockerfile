FROM java:11
ADD C:/ProgramData/Jenkins/.jenkins/workspace/Docker/build/libs/crud-0.0.1-SNAPSHOT.jar docker-sample.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/docker-sample.jar"]