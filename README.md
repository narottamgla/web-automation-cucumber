# Web Automation with Cucumber

Welcome to the Web Automation project using Cucumber! This repository contains a framework for automated web testing utilizing Cucumber and Selenium WebDriver with Java.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Prerequisites](#prerequisites)
- [Setup](#setup)
- [Configuration](#Configuration)
- [Project Structure](#project-structure)
- [Contributing](#contributing)
- [License](#license)

## Introduction

This project is designed to automate web application testing using Cucumber, a tool that supports Behavior Driven Development (BDD), and Selenium WebDriver for browser automation. It provides a simple, readable format for writing test scenarios and integrates well with Java.

## Features

- **Behavior Driven Development**: Write tests in a human-readable format using Gherkin syntax.
- **Web Automation**: Automate interactions with web applications using Selenium WebDriver.
- **Page Object Model**: Organized code structure to separate test logic from page-specific details.
- **Extensible**: Easily add new steps and page objects to extend functionality.

## Prerequisites

Before you begin, ensure you have met the following requirements:

- **Java 8 or higher**: Ensure Java is installed and properly set up on your machine.
- **Maven**: For dependency management and project build.
- **Selenium WebDriver**: For browser automation (included via Maven dependencies).
- **Cucumber**: For defining and executing BDD test cases (included via Maven dependencies).

## Setup

1. **Clone the Repository**

   ```bash
   git clone https://github.com/narottamgla/web-automation-cucumber.git

2. **Navigate to the Project Directory**

   ```bash
   cd web-automation-cucumber

3. **Install Dependencies**

Make sure you have Maven installed. Run the following command to install the necessary dependencies:

   ```bash
   mvn install
   ```

4. **Execute tests**

  ```bash
   mvn clean test -P stage
  ```

## Configuration
Maven profiles are used to manage different environments. Each profile specifies a different resource file path. Profiles are defined in pom.xml, and resource files are located in src/test/resources (e.g., config/test/config.properties, config/stage/config.properties, config/preprod/config.properties).

## Project Structure
```bash
web-automation-cucumber/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── web/
│   │   │           └── connectors/
│   │   │           └── utils/
│   │   │           └── drivers/
│   │   │           └── enums/
│   │   │           └── executiondata/    
│   │   │
│   └── test/
│       ├── java/
│       │   └── com/
│       │       └── web/
│       │           └── hooks/
│       │           └── pagelocators/
│       │           └── pageactions/
│       │           └── steps/
│       │           └── runner/
│       └── resources/
│           └── features/
│           └── config/
│                   └── dev/
│                   └── qa/
│                   └── preprod/
│           └── log4j2.xml
│           └── extent.properties
│
│
├── .gitignore
├── pom.xml
└── README.md

  ```

## Contributing
We welcome contributions to the project! To contribute:

- **Fork the Repository**: Create a fork of the repository on GitHub.
- **Create a Branch**: Create a new branch for your feature or bug fix.
- **Make Changes**: Implement your changes and ensure they are well-tested.
- **Submit a Pull Request**: Submit a pull request with a description of your changes.
