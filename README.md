# pom-selenium-selenide-assignment
Prerequisites: 
-	Chrome Browser must be installed - Version 86.0.4240.198 (Official Build) (64-bit)
-	Set up Java Environment variable - jdk-15.0.1
-	Set up Maven Environment variable - apache-maven-3.6.3-bin
-	Internet connectivity

Software & Tools installation: 
-	IntelliJ IDEA Community Edition
Project Description & Execution:
Description: 
-	Web Automation Using: Selenium WebDriver, Selenide
-	Test Suit Management: TestNG
-	CI Tool: Maven, Maven Surefire Plugin
-	Pattern: Page Object Model, Page Factory
-	Language: Java
Execution:
Clone the project or simply download it as Zip and then open it in the IntelliJ IDEA.
Run as a TestNG:
-	There is file "testng_selenium_assignment.xml" on route directory of project, right click -> Run 
Run as Maven Command Line:
-	Open cmd and go to project directory. Type command
mvn clean test
By running it from IDE or command line Chrome browser will open and "Test Case" will execute successfully.
3- Reporting:
	a) Right click on the project and F5 Refresh it.
	b) Expand the "target" folder and find the folder "surefire-reports" 
	c) Find the file “index.html” and copy its path".
	d) Paste it in the browser and click enter and Report of Test Execution will be displayed.
Hint: Path could be like this; 
C:\Users\Fazal-Rehman\eclipse-workspace\com.selenium.assignment\test-output\Assignment.html