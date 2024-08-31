<!--
<h2 align="center">
  Welcome to Narottam Singh World!
  <img src="https://media.giphy.com/media/hvRJCLFzcasrR4ia7z/giphy.gif" width="28">
</h2>
-->

<!--
<p align="center">
  <a href="https://github.com/narottamgla"><img src="https://readme-typing-svg.herokuapp.com/?lines=Self%20Taught%20Programmer;Front%20End%20Developer;1.5%2B%20years%20of%20coding%20experience;Always%20learning%20new%20things&center=true&width=380&height=45"></a>
</p>

 -->

<a href="https://komarev.com/ghpvc/?username=narottamgla">
  <img align="right" src="https://komarev.com/ghpvc/?username=narottamgla&label=Visitors&color=0e75b6&style=flat" alt="Profile visitor" />

</a>

<!-- Intro  -->
<h3 align="center">
        <samp>&gt; Hey There!, I am
                <b><a target="_blank" href="https://www.linkedin.com/in/narottamgla/">Narottam Singh</a></b>
        </samp>
</h3>


<p align="center"> 
  <samp>
    <br >
     <b>「 I am a full stack Test developer from <b>India</b> 」</b>
    </br>
  </samp>
</p>

<p align="center">
 <a href="https://linkedin.com/in/narottamgla" target="_blank">
  <img src="https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white" alt="alsiam"/>
 </a>
</p>
<br />

<!-- About Section -->
 # About me
 
<p>
 <img align="right" width="1050" src="/assets/programmer.gif" alt="Coding gif" />
  
 ✌️ &emsp; Enjoy to do programming and sharing knowledge <br/><br/>
 ❤️ &emsp; Love to writing code and learning new features<br/><br/>
 📧 &emsp; Reach me anytime: narottamgla@gmail.com<br/><br/>

</p>


# Web Automation with Cucumber

Welcome to the Web Automation project using Cucumber! This repository contains a framework for automated web testing utilizing Cucumber and Selenium WebDriver with Java.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Project Structure](#project-structure)
- [Prerequisites](#prerequisites)
- [Setup](#setup)
- [Configuration](#Configuration)
- [Extent-Report Sample](#Extent-Report-Sample)
- [Contributing](#contributing)

## Introduction

This project is designed to automate web application testing using Cucumber, a tool that supports Behavior Driven Development (BDD), and Selenium WebDriver for browser automation. It provides a simple, readable format for writing test scenarios and integrates well with Java.

## Features

- **Behavior Driven Development**: Write tests in a human-readable format using Gherkin syntax.
- **Web Automation**: Automate interactions with web applications using Selenium WebDriver.
- **Page Object Model**: Organized code structure to separate test logic from page-specific details.
- **Extensible**: Easily add new steps and page objects to extend functionality.

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
│       │           └── runners/
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

## Prerequisites

Before you begin, ensure you have met the following requirements:

- **Java 8 or higher**: Ensure Java is installed and properly set up on your machine.
- **Maven**: For dependency management and project build.
- **Selenium WebDriver(4)**: For browser automation (included via Maven dependencies).
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

## Extent-Report Sample

[ExtendPDF.pdf](https://github.com/user-attachments/files/16824076/ExtendPDF.pdf)

![extent](https://github.com/user-attachments/assets/32b84744-9d14-4859-94ef-66bf578f74ad)

## Contributing
We welcome contributions to the project! To contribute:

- **Fork the Repository**: Create a fork of the repository on GitHub.
- **Create a Branch**: Create a new branch for your feature or bug fix.
- **Make Changes**: Implement your changes and ensure they are well-tested.
- **Submit a Pull Request**: Submit a pull request with a description of your changes.
