package com.pages;

import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.base.BaseClass;

public class HomePage extends BaseClass {

	// Defining the Object Repository for HomePage

	@FindBy(linkText = "Chapter1")
	WebElement linkChapter1;

	public HomePage() {
		// This initElements method will trigger/initiate all WebElements within this page
		PageFactory.initElements(driver, this);
	}
	public void clickLinkChapter1() {

		try {
			$(By.linkText("Chapter1")).should(Condition.appear).click();
		} catch (ElementNotInteractableException e) {
			e.printStackTrace();
		} catch (ElementNotSelectableException e) {
			e.printStackTrace();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	}

}
