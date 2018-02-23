package br.com.device;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class InitializeDevices {

	private static DesiredCapabilities capability = null;

	public static Capabilities startIOS() {

		capability = new DesiredCapabilities();
		//File file = new File("/Users/yamanuser/IOSProject/UIKitCatalogiOSCreatingandCustomizingUIKitControls/UIKitCatalog");
		capability.setCapability(MobileCapabilityType.DEVICE_NAME, "IOS");
		capability.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.IOS);
		capability.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.2");
		capability.setCapability(MobileCapabilityType.BROWSER_NAME, "safari");
		capability.setCapability(MobileCapabilityType.UDID, "f8bfa247773446812676d08222dd215929da13ca");
		//capability.setCapability(MobileCapabilityType.APP, file);
		return capability;
	}

}
