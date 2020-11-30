package com.TestClasses;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

import com.util.MainConfiguration;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.base.BaseClass;
import com.codeborne.selenide.Selenide;
import com.pages.Chapter1Page;
import com.pages.HomePage;

public class TestHomePage extends BaseClass {

	HomePage ObjHomePage;
	Chapter1Page ObjChapter1;
	MainConfiguration objMainConfiguration;
	@BeforeMethod
	public void setUp()  {

		objMainConfiguration = new MainConfiguration();
		initialization(objMainConfiguration.getResponse("browser"));
		ObjHomePage = new HomePage();
		ObjChapter1 = new Chapter1Page();
	}

	@Test()
	public void testNavigationChapter1ToHomePage() {

		ObjHomePage.clickLinkChapter1();
		$("#divontheleft").shouldHave(text("Assert that this text is on the page"));
		ObjChapter1.clickHomeLink();
		$(By.linkText("Chapter1")).should(appear);
	}

	@AfterMethod
	public void tearDown() {
		Selenide.closeWebDriver();
	}
}