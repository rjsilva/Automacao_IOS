package br.com.button;

import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileDriver;

public class Button{
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void swipe(MobileDriver element) {

		// classe anonima
		IButton button1 = new IButton<MobileDriver>() {
			public void action(MobileDriver button) {
				//button.swipe(startx, starty, endx, endy, duration);
			}
		};
		button1.action(element);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void click(WebElement element) {

		// classe anonima
		IButton btnClick = new IButton<WebElement>() {
			public void action(WebElement element) {
				element.click();
			}
		};
		btnClick.action(element);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void clear(WebElement element) {

		// classe anonima
		IButton btnClear = new IButton<WebElement>() {
			public void action(WebElement element) {
				element.clear();
			}
		};
		btnClear.action(element);
	}

}
