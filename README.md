This automation framework is for Cafe TOWNSEND test application

Project Introduction:
It is a Maven-based project withSelenium TestNG Framework is written in JAVA language.
Page Object Model design pattern has been used to create an Object Repository for web elements with a focus on to achieve Code Reusability and Code Maintainability. 

Pre - requisites:
1. IDE
2. Java SDK 1.8
3. Maven 3.3 or newer

Downloading and setting the project:
1. Please clone or download the project from https://github.com/PrekshaKasliwal04/Test_Assignment_CafeTownSend
2. Install project as a new Maven project 
File > Import > Maven > Existing Maven Projects

Executing project:

There are many ways to execute tests

1. From commandline 
mvn test -DbrowserName=FIREFOX -Denvironment=CAFETOWNSEND -DsuiteXmlFile='testng.xml'
(This ensures tests to run on Firefox for environment  CAFETOWNSEND using  testing.xml )

2. From IDE:
a. Using pom.xml file: Right-click and Run as Maven Install or Maven test.
b. Running testng.xml file: This file is under the suites folder and can be run using a right-click option. 

Test Results: 
 Test reports can be found at " target\surefire-reports " .
 I have also tried creating jar file, can be find at target folder after the execution. 

Framework Choice:
The combination of Selenium and Java is preferred as an automation framework because of being highly flexible due to its compatibility with a wide range of browsers and scripting languages. 
Java provides us different libraries that can be used directly in the project.
TestNG is used to handle the automated test suite execution and report generation.

Key Notes:
•         Framework is designed to retry failed test cases twice.
•         Browser, environment and TestNG suite parameters can be passed from pom.xml.
•         Properties file is used to maintain object repository. (All locator values are mentioned inside it along with         environment.properties to make it easy to amend values without actually changing the class files.)
•         Reusable and common operational methods are written to optimize code inside package com.basesource.actions


