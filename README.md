# PROJECT DESCRIPTION

This is a WEB Automation Testing program created for the Demoblaze.

## Overall Report
![Overall Report](overall.png)

## Tools and Technology Stack
- **Integrated Development Environment (IDE):** [IntelliJ IDEA Community Edition](https://www.jetbrains.com/idea/)
  - *Description:* IntelliJ IDEA Community Edition is used as the IDE for software development in this project. It provides rich features for code editing, debugging, and project management.

- **Testing and Automation:**
  - **Serenity**
    - *Description:* Serenity is an automated testing framework that focuses on creating rich and understandable reports. By using Serenity, you can simplify the creation and execution of automated tests and obtain informative reports on test results.
  - **Cucumber**
    - *Description:* Cucumber is a behavior-driven development (BDD) tool that allows developers and stakeholders to write test scenarios in human-readable language. By using Cucumber, you can create living documentation of application behavior and facilitate communication between developers and non-developers.
  - **Selenium**
    - *Description:* Selenium is an open-source tool used to automate web testing across various browsers and platforms. Selenium allows software developers to write testing scripts in various popular programming languages such as Java, Python, C#, Ruby, and others. This tool can be used to test various aspects of web applications, including functionality, performance, and security.

- **Build Management:**
  - **Maven**
    - *Description:* Maven is used as a project management tool to manage dependencies, configuration, and project build processes. It helps in organizing project lifecycles and managing dependencies efficiently.
      
- **Version Control:**
  - **Git**
    - *Description:* Git is a distributed version control system that facilitates collaborative development, tracking changes in source code, and managing project history.

# HOW TO RUN PROJECT

Here are the steps to run the QE-WEB application:

1. Clone this repository into your local system using the following command:

    ```bash
    git clone https://github.com/rayariff/Demoblaze-WebAutomation.git
    ```

2. Make sure you have Java installed and properly set up the Java environment on your system.

3. Open this project in your preferred text editor (intellij IDEA is recommended).

4. Open the terminal in the text editor or another available terminal.

5. Run the following command to clean and verify the project using Maven:

    ```bash
    mvn clean test
    ```

   This command will clean the project, download dependencies, and run all existing tests.

6. After the process completes without errors, you can now run the application as per the project requirements.
