package br.com.helper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import br.com.util.DriversFactory;
import io.appium.java_client.AppiumDriver;

public abstract class AuxRobot {

	private static AppiumDriver driver;
	
	public AuxRobot() {
		this.startDriver();
	}

	protected final void startDriver() {

		try {
			if (driver == null) {
				driver = DriversFactory.getDriver();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void initElements(Object class1) {
		driver = DriversFactory.getMobileDriver();
		PageFactory.initElements(driver, class1);
	}

	protected void setElement(WebElement element, String texto) {
		element.sendKeys(texto);
	}

	protected final void navigateTo(String url) {
		driver.get(url);
	}

	protected static void closeDriver() {
		driver = DriversFactory.getMobileDriver();
		driver.quit();
	}

}
