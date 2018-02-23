package br.com.util;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.openqa.selenium.Capabilities;

import br.com.device.DeviceFile;
import br.com.device.Devices;
import br.com.device.InitializeDevices;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;

public abstract class DriversFactory {

	private static AppiumDriver driver = null;
	private static Capabilities capability;

	@SuppressWarnings({ "rawtypes" })
	public static AppiumDriver getDriver() throws ClientProtocolException, IOException {
		Devices device = Devices.valueOf(DeviceFile.getDevice());
		switch (device) {
		case IOS:
			capability = InitializeDevices.startIOS();
			return driver = new IOSDriver(capability);
		case ANDROID:
			//capability = new InitializeDevices().startDevice(new Capability());
			//return driver = new AndroidDriver(capability);
		default:
			System.out.println("nao existe esse device");
			break;
		}
		return driver;
	}

	public static AppiumDriver getMobileDriver() {

		return driver;
	}

}
