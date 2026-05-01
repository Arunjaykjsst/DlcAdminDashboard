FROM maven:3.9-eclipse-temurin-17

WORKDIR /app

# Copy dependency manifest first for better layer caching
COPY pom.xml .
RUN mvn dependency:go-offline -B

# Copy test suite and source
COPY testng.xml .
COPY src ./src

# Run tests; results land in target/allure-results


CMD ["sh", "-c", "mvn clean test -B; TEST_EXIT=$?; mvn allure:report -B; exit $TEST_EXIT"]
