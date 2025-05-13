# Use an official OpenJDK image as the base
FROM openjdk:17-jdk-slim

# Add a volume pointing to /tmp
VOLUME /tmp

# Add the application jar to the container
ARG JAR_FILE=target/LibraryManagement-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar

# Run the jar file
ENTRYPOINT ["java","-jar","/app.jar"]
