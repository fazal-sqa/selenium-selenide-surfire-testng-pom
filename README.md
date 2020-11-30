# pom-selenium-selenide-assignment

Prerequisites: 
	i)  Chrome Browser must be installed - Version 86.0.4240.198 (Official Build) (64-bit)
	ii) Internet connectivity
	iii)Java Environment variable - jdk-15.0.1
	iv) Maven Environment variable - apache-maven-3.6.3-bin
	
Software & Tools installation: 

1- Eclipse IDE for Enterprise Java Developers 
	Version: 2019-03 (4.11.0)
	Build id: 20190314-1200
	Source: https://www.eclipse.org/ 

2- TestNG plugin 

	Instructions: 
	a) Open Eclipse - > Help menu -> Install New Software 
	b) Click on Add button 
	c) In "Name" field write TestNG and in the "Location" enter the URL - http://dl.bintray.com/testng-team/testng-eclipse-release/
	d) Click Add button.
	e) Check the TestNG checkbox appearing in the results options and click on Next button. 
	f) Follow the instructions and install TestNG Plugin and restart the Eclipse. 

3- Code Cloning & Execution:

	Description: This project is "Maven" based that contains the "Selenium WebDriver" script for Web Application automation. 
	Page Object Model and Page Factory Pattern is used to write the code. TestNG is used for the Test Case Management and for reporting "Extent Reports" are
	used. Java is used a programming language in this project. Moreover, Project Object Model (pom.xml) is used in order to includes and maintain the
	required decencies. 

	a) Clone the code repo: https://github.com/fazal-sqa/selenium_assignment_pom.git
	b) Find a a folder named "chromedriver_win32" within the cloned repo just cut this folder and place it in the C: drive.
	c) There is file "testng_selenium_assignment.xml" on route directory of project, right click -> Run As -> TestNG Suite
	d) Chrome browser will open and "Test Case" will be executed successfully.
	e) To execute it through the command line run this command 
	Syntax of command:
	{Project Directory} java -cp "path-to-jar/testng.jar:path_to_yourtest_classes" org.testng.TestNG testng.xml

4- Reporting:

	a) Right click on the project and F5 Refresh it.
	b) Expand the "test-output" folder and find the file "Assignment.html" 
	c) Right click on the "Assignment.html" and click on the "Properties".
	d) There is a field, "Location" and there is a path mentioned in front of it.
	e) Copy the path and paste it in the browser and click enter and Report of Test Execution will be displayed.

	Hint: Path could be like this; 
	C:\Users\Fazal-Rehman\eclipse-workspace\com.selenium.assignment\test-output\Assignment.html
