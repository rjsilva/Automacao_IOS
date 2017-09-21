package br.com.util;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;

public class UniqueDriver {

	private static WebDriver uniqueDriver = null;

	public static synchronized WebDriver getDriver(Devices device) throws MalformedURLException {

		if (uniqueDriver == null)
		uniqueDriver = new DriverFactory().getDriver(device);
		return uniqueDriver;

	}

}
