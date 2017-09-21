package br.com.util;

import java.net.MalformedURLException;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;

import br.com.device.InitializeDevices;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class UniqueDriver {

	private static WebDriver uniqueDriver = null;
	private static Capabilities capability = null;

	@SuppressWarnings("rawtypes")
	public static synchronized WebDriver getDrive(Devices device) throws MalformedURLException {

		if (uniqueDriver == null && device == Devices.IOS) {
			capability = new InitializeDevices().startIOS();
			uniqueDriver = new IOSDriver(capability);

			return uniqueDriver;
			
		} else if (uniqueDriver == null && device == Devices.ANDROID) {
			capability = new InitializeDevices().startIOS();
			uniqueDriver = new AndroidDriver(capability);
			
			return uniqueDriver;
		}

		return uniqueDriver;

	}

}
