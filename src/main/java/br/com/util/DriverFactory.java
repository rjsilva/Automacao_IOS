package br.com.util;

import java.net.MalformedURLException;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;

import br.com.device.InitializeDevices;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class DriverFactory {

	private WebDriver driver = null;
	private static Capabilities capability = null;

	@SuppressWarnings("static-access")
	public WebDriver getDriver(Devices device) throws MalformedURLException {
	    
		switch (device) {
		case IOS:
			capability = new InitializeDevices().startIOS();
			driver = new IOSDriver(capability);
			return driver;
		case ANDROID:
			capability = new InitializeDevices().startIOS();
			driver = new AndroidDriver(capability);
			return driver;
		default:
			System.out.println("nao existe esse device");
			break;
		}
		return driver;
	}

}
