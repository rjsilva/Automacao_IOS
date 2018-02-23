package br.com.device;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DeviceFile {
	
	
	public static Properties getProp() throws IOException {
		Properties props = new Properties();
		FileInputStream file = new FileInputStream(
				"./src/drivers/device.properties");
		props.load(file);
		return props;
	}
	public static String getDevice() throws IOException {
		Properties prop = getProp();
		return prop.getProperty("device");
	}
	
}
