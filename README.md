# Practice-Automation
## **Project Description** 
 The contains all possible automation scripts of the components present in the Website.
  
  
  Website url = https://www.globalsqa.com/demo-site/

  
## **Prerequisites**
Java Development Kit (JDK) installed

Maven installed

IDE (e.g., IntelliJ IDEA, Eclipse) for Java development

## **Setup Instructions**
Clone the Maven project repository.

Open the project in your preferred IDE.

Ensure TestNG is added as a dependency in the pom.xml file.

Execute test classes under the src/test/java directory.

## **Features**

**-Maven:** Manages project dependencies and facilitates easy project setup and configuration.

**-TestNG:** Implements TestNG for efficient test case management and execution.

**-GitHub Actions Workflow:** Incorporates GitHub Actions to automate the build and execution process, ensuring seamless integration into the development workflow.


## **Project Structure**

 **Project Contains**
 
**1. Base:**

- `BaseTest.java`: This class contains setup and teardown methods that are essential to be executed before and after all the tests.

It initializes the WebDriver (e.g., ChromeDriver), extends report functionality, and provides teardown methods to close the browser window.

**2. PageObject:**

- `FirstStep.java` and `SecondStep.java`: These classes contain locators and methods specific to the endoints.

They follow the Page Object Model design pattern and encapsulate the interactions with the web elements on their respective pages.

**3. PageEvent:**

- `PageFactoryInitializer.java`: This class initializes the Page Factory and performs actions related to test events.

It implements PageObject interfaces and facilitates interactions with the web elements.

**4. Utility:**

- Routes: Contains Base Url and endpoints, where scripts run on.

- `RetryAnalyzer.java`: This class contains methods for retry analysis, aimed at reducing flakiness in test execution. It may include logic for retrying failed test cases.

- SuiteListenes.java :The `SuiteListener` class implements TestNG listeners to capture test failures and retry annotations. It saves screenshots of failed tests and applies

a retry analyzer to test methods annotated with `@Test`.

**5. Test Scripts:**

- `TestScripts.java`: This class contains actual test scripts written using TestNG. It extends `BaseTest.java` to inherit setup and teardown methods. Test methods are written here and are responsible for interacting with the PageObjects and executing test steps.
- The component onto which tests are scripted are
  1.Accordions
      --Testcase1 : To verify That Accordions Are Working as Expected.
  2.Alets
      --Testcase1: To Validate Alert's Message.
  3.DialogBox
      --Testcase1: Verify that the user can successfully enter data into a dialog box and create an account through Dialog Box.
  4.DropDown
      --Testcase1: Verify that the dropdown selection functionality works as expected.
  5.ProgressBar
     --Testcase1: Verify Progress Bar Button Functionality
     --Testcase2: Verify Progress Bar Reaches 100% Completion
  6.Multiple Element selection
     --Testcase1: Verify that it can select Multiple Element
  7.Sliders
     --Testcase1: Verify Slider's Movement
  8.Sortables
     --Testcase1: Verfiy if interchange of feed's And Shopping's position is possible 
  9.Spinner
     --Testcase1: Verifying Spinner's Functionality
  10.Tabs And Windows
     --Testcase1: Verify That After Clicking Button It Changes the Tab
  11.ToolTip
     --Testcase1: Verify whether the tooltip works as expected.

**6. Configurations:**

- `Config.properties`: This file contains URLs and environment configurations, such as test environment URLs. It can be used to store any other configuration parameters needed for the tests.

**7.Pom.xml :**

contains all dependencies ,plugins which are very essential for the test.

**8.testng.xml:**

Through this we can execute test in suite.

## **Additional Resources**
**TestNG Documentation:** [TestNG Official Website](https://testng.org/)

**Maven Documentation:** [Apache Maven Official Website](https://maven.apache.org/guides/index.html)

# **Contributor**

Gargi KoparKar

gargikoparkar@gmail.com
