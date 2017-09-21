package br.com.util;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;

public class DriverFactory {

	private WebDriver driver = null;

	@SuppressWarnings("static-access")
	public WebDriver getDriver(Devices device) throws MalformedURLException {
	    
		switch (device) {
		case ANDROID:
			driver = new UniqueDriver().getDrive(Devices.ANDROID);
			return driver;
		case IOS:
			driver = new UniqueDriver().getDrive(Devices.IOS);
			return driver;
		default:
			System.out.println("nao existe esse device");
			break;
		}
		return driver;
	}

}
