package br.com.device;

public enum Devices {

	IOS("IOS"),ANDROID("ANDROID"),
	FIREFOX("FIREFOX"),CHROME("CHROME");

	public String device;
	
	private Devices(String device) {
		this.device = device;
	}
}
