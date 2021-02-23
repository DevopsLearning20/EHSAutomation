# EHSAutomation

Introduction about framework -  
Used a page object design pattern approach in this framework. Main advantage of this framework, it is easy to maintain page based. I attacheed we execution project in root path


Tools -
Design Pattern - Page Object Model using BY Class.
BDD - Cucumber.
Project Build - Maven. 
Script - BDD,Java, JavaScript.
TestFramwork - Junit.
Reports - Spark Reports with screen shot, Cucumber 6.0 Html Report, PDF report.


Framework divided in various layers of packages which is having their single responsibility.

Feature Layer - In this package test cases are written in GHERKIN language, feature file is created based documentaion.All sceanrios are taged with diffrent tags, with the help of tags we can run testRunner file.
Page Layer - Page layer placed in the main folder of maven, we consider each page as each page class, In that we mentioned the WebElement path and actions of the page and each Webelement is encapsulated with actions.
Steps layer  - Steps Layer placed in maven test folder, each class created based on page layer. Responsibility of the step layer is verifications of actions which are written in page layers  using JUNIT or TestNG any library we can use here. 
Driver factory - This package responsible for driver invocation. Thread local concept is used to manage to invoke a single driver instance. which helps to manage synchronization during parallel execution of test cases. 
Config Layers - This package responsible for all configuration of the project. I maintained Report configurations, Project configuration, Environment Configuration.
Util layers - This package responsible for helper methods for read configurations, Manage constant, Wrapper methods.
Test Runner - This package is responsible for execution, various setting tagged based execution is managed  from test runner. 
Resources - All files which are help for upload, Excel for test data reading, all project resources managed from here.
Test output - All execution reports stores in this folder.
Constant layer - All constant managed in this class.
Logger Layer - LOG4J used for maintain execution logs.

enhancements
===========
1. Grid Implementation
2. Utility Enchnacement

How to Run the project 
======================

Using IntelliJ IDE

1- Pull main branch 
2- Please Import as maven in IntelliJ.
3. Clean and Install maven Dependencies.
4. Execute from testRunner class.

Run using CMD

- Open project in CMD and navigate till root directory 
- Enter "mvn clean test" in CMD



