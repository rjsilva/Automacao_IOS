package br.com.device;

import java.net.MalformedURLException;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

import br.com.util.InitializeServer;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class InitializeDevices {


	public Capabilities startIOS() {

		DesiredCapabilities capability = new DesiredCapabilities();
		capability.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 5");
		capability.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.IOS);
		capability.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.3");
		capability.setCapability(MobileCapabilityType.BROWSER_NAME, "safari");
		capability.setCapability(MobileCapabilityType.UDID, "BF352801-4B69-4469-99D0-9F150CE2C61E");
		return capability;
	}

	public Capabilities startAndroid() throws MalformedURLException {

		new InitializeServer().statrtServer();
		DesiredCapabilities capability = new DesiredCapabilities();
		capability.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		capability.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
		capability.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		capability.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		capability.setCapability("avd", "Galaxy Nexus");
		return capability;
	}

}
