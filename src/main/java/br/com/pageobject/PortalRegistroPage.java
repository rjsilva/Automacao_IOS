package br.com.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import br.com.helper.AuxRobot;

public class PortalRegistroPage extends AuxRobot{
	
	@FindBy(className = "field")
	private WebElement campoCpf;
	
	@FindBy(className = "ng-valid-maxlength")
	private WebElement campoEmail;
	
	@FindBy(className = "ng-pristine")
	private WebElement campoNome;
	
	@FindBy(className = "ng-untouched")
	private WebElement campoTelefone;
	
	public PortalRegistroPage() {
		initElements(this);
	}
	
	public void setCpf(String cpf) {
		setElement(campoCpf, cpf);
	}
	
	public void setEmail(String email) {
		setElement(campoEmail, email);
	}
	
	public void setNome(String nome) {
		setElement(campoNome, nome);
	}
	
	public void setTelefone(String telefone) {
		setElement(campoTelefone, telefone);
	}
	
	public void navigate(String url) {
		navigateTo(url);
	}

}
