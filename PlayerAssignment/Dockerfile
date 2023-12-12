# Build stage with Maven builder image
FROM maven:3.8.4-openjdk-17 as builder

COPY . .

# Build the project and skip tests
RUN mvn clean package -DskipTests

# Package stage with OpenJDK image
FROM eclipse-temurin:17-jre

WORKDIR /app

# Copy the JAR file to the root directory
COPY --from=builder /target/PlayerAssignment.jar /app/PlayerAssignment.jar

ENTRYPOINT ["java", "-jar", "PlayerAssignment.jar"]
