<<<<<<< HEAD
# Dlc_Admin_Dashboard
Dlc_Admin_Dashboard
=======
# dlc_master_admin (Rest Assured + TestNG)

## Overview

This project is an API Automation Framework built using:

* Java
* Rest Assured
* TestNG

The framework follows a Service Object Model (POM-like design) to ensure scalability, maintainability, and reusability.


## Tech Stack

* Java
* Rest Assured
* TestNG
* Maven
* Jackson (for JSON parsing)

---

## Framework Flow

TestNG
 ↓
tests (KeyAddTest.java)
 ↓
dataprovider (KeyAddTestDataProvider.java)
 ↓
testdata (JSON file)
 ↓
JsonReader (utils)
 ↓
payloads (KeyAddRequestData.java)
 ↓
api (KeyAddApi.java)
 ↓
core (ApiClient.java)
 ↓
API Server
 ↓
Response
 ↓
Test (Assertions)


## Key Components

RestClient:
Handles all HTTP methods (GET, POST, PUT, DELETE).

Services Layer:
Represents API endpoints (POM design).

Tests Layer:
Contains test cases and assertions.

ConfigReader:
Reads configuration from properties file

Routes:
Stores all API endpoints.

---

## How to Run Tests

### Using Maven

mvn clean test

### Using TestNG

* Right click `testng.xml`
* Run as TestNG Suite
 
---

## Configuration

Update environment in:

```
src/test/resources/config/qa.properties
```

Example:

```
baseUrl=https://dev.kjsstpay.co.in
```

---

## Sample Test Case


## Test Coverage

* Positive Testing
* Negative Testing
* Boundary Testing
* Security Testing

---

## Future Enhancements

* Add Authentication handling
* Integrate Allure/Extent Reports
* Add Retry Mechanism
* Data-driven testing using JSON/Excel
* CI/CD integration (Jenkins)

---

##Author

**Arunjay Rana**
QA & Automation Test Engineer

## Project Structure
---
com.kjsst.api.dlc_master_admin
│
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── api
│   │   │   │   ├── KeyAddApi.java
│   │   │   │   └── KeyReportApi.java
│   │   │   │
│   │   │   ├── core
│   │   │   │   ├── ApiClient.java
│   │   │   │   └── TestSetup.java
│   │   │   │
│   │   │   ├── payloads
│   │   │   │   ├── KeyAddRequestData.java
│   │   │   │   └── KeyReportRequestData.java
│   │   │   │
│   │   │   ├── routes
│   │   │   │   └── ApiRoutes.java
│   │   │   │
│   │   │   └── utils
│   │   │       ├── JsonReader.java
│   │   │       ├── ConfigReader.java
│   │   │       └── LoggerUtil.java
│   │   │
│   │   └── resources
│   │
│   ├── test
│   │   ├── java
│   │   │   ├── dataprovider
│   │   │   │   ├── KeyAddTestDataProvider.java
│   │   │   │   └── KeyReportDataProvider.java
│   │   │   │
│   │   │   ├── tests
│   │   │   │   ├── KeyAddTest.java
│   │   │   │   └── KeyReportTest.java
│   │   │   │
│   │   │   ├── listeners
│   │   │   │   └── TestListener.java
│   │   │   │
│   │   │   └── retry
│   │   │       └── RetryAnalyzer.java
│   │   │
│   │   └── resources
│   │       ├── config
│   │       │   ├── dev.properties
│   │       │   └── qa.properties
│   │       │
│   │       ├── payloads
│   │       │   └── request.json
│   │       │
│   │       └── testdata
│   │           ├── KeyAddTestData.json
│   │           ├── KeyReportTestData.json
│   │           └── testdata.json
│
├── pom.xml
├── testng.xml
├── README.md
├── target
├── test-output
└── allure-results
>>>>>>> f060101 (First commit)
