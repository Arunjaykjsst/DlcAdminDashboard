FROM maven:3.9.9-eclipse-temurin-17

WORKDIR /app

# Copy project files
COPY . .

# Build project (skip tests to speed build)
RUN mvn clean install -DskipTests

# Run tests when container starts
CMD ["mvn", "test", "-Dsurefire.suiteXmlFiles=testng.xml"]