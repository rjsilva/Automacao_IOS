package br.com.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AuxRobot {

	private WebDriver driver;

	public AuxRobot(WebDriver driver) {
		this.driver = driver;
	}

	public void click(By by) {
		findElement(by).click();
	}

	public WebElement findElement(By by) {
		return driver.findElement(by);

	}

	public WebElement typeElement(By by) {
		return driver.findElement(by);
	}

	public void goToUrl(String url) {

		driver.get(url);

	}

}
