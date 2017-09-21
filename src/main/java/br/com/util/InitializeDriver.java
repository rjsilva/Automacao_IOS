package br.com.util;

public class InitializeDriver {
	
	private static InitializeDriver uniqueInstance;

	private InitializeDriver() {
		
	}

	public static synchronized InitializeDriver getInstance() {
		
		if (uniqueInstance == null)
			uniqueInstance = new InitializeDriver();

		return uniqueInstance;
	}

}
