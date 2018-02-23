package br.com.pageobject;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import br.com.helper.AuxRobot;

public class CpfPage extends AuxRobot{

	@FindBy(id = "numero")
	private WebElement campoCpf;
	
	public CpfPage(){
		initElements(CpfPage.class);
	}
	
	public Boolean getCpfStatus() {
		return campoCpf.isDisplayed();
	}
	
	public void navigate() {
		navigateTo("https://www.geradordecpf.org/");
	}

}
