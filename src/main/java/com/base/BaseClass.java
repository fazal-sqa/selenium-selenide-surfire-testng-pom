package com.base;

import static com.codeborne.selenide.Selenide.*;

import com.util.MainConfiguration;
import org.openqa.selenium.WebDriver;

public class BaseClass {

	public static WebDriver driver;

	public static void initialization(String browserName)  {

		MainConfiguration objMainConfiguration = new MainConfiguration();

		// Chrome Browser -- WebDriver Configurations
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
			System.getProperty("user.dir") + "//Drivers//chromedriver_win32//chromedriver.exe");
		}
		try {
			open(objMainConfiguration.getResponse("url"));
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Unable to Open the Required Page");
		}
	}
}