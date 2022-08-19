FROM openjdk:11
ARG JAR_FILE
COPY ${JAR_FILE} newapp.jar
ENTRYPOINT ["java", "-jar", "/newapp.jar"]