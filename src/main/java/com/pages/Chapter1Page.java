package com.pages;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.base.BaseClass;

public class Chapter1Page extends BaseClass {

	@FindBy(id = "divontheleft")
	WebElement textToAssert;

	@FindBy(linkText = "Home Page")
	WebElement linkHomePage;

	public Chapter1Page() {
		PageFactory.initElements(driver, this);
	}

	public String verifyText() {

		String text = $("#divontheleft").should(appear).getText();
		return text;
	}

	public void clickHomeLink() {
		try {
			$(By.linkText("Home Page")).click();

		} catch (ElementNotInteractableException e) {
			e.printStackTrace();
		} catch (ElementNotSelectableException e) {
			e.printStackTrace();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	}
}