package br.com.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import br.com.helper.AuxRobot;

public class ButtonPage extends AuxRobot{
	
	public ButtonPage() {
		initElements(this);
	}
	
	@FindBy(id = "btn-gerar-cpf")
	public static WebElement btnGerarCpf;

	@FindBy(className = "btn")
	public static WebElement btnValidarCpf;
	
	@FindBy(className = "btn")
	public static WebElement btnContinuar;
	
}
