package com.TestClasses;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.base.BaseClass;
import com.codeborne.selenide.Selenide;
import com.pages.Chapter1Page;
import com.pages.HomePage;

public class TestHomePage extends BaseClass {

	HomePage ObjHomePage;
	Chapter1Page ObjChapter1;

	@BeforeMethod
	public void setUp() throws IOException, Exception {

		//Reading config properties file
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/config.properties");
		prop.load(ip);
		initialization(prop.getProperty("browser"));
		ObjHomePage = new HomePage();
		ObjChapter1 = new Chapter1Page();
	}

	@Test()
	public void testNavigationChapter1ToHomePage() throws InterruptedException, IOException {

		ObjHomePage.clickLinkChapter1();
		String actualText = ObjChapter1.verifyText();
		String expectedText = "Assert that this text is on the page";
		Assert.assertEquals(actualText, expectedText, "Text is not correct as required!");
		ObjChapter1.clickHomeLink();
		$(By.linkText("Chapter1")).should(appear);
	}

	@AfterMethod
	public void tearDown() {
		Selenide.closeWebDriver();
	}
}
