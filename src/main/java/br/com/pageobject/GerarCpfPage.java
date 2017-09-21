package br.com.pageobject;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.com.util.AuxRobot;
import br.com.util.Devices;
import br.com.util.DriverFactory;

public class GerarCpfPage {

	private AuxRobot robot = null;
	private WebDriver driver = null;


	private By gerarCpf = By.id("btn-gerar-cpf");

	private By validarCpf = By.className("btn");

	private By cpfSucesso = By.id("checkSign");

	private By cpfErro = By.id("xSign");

	private By campoCpf = By.id("numero");

	public By getCampoCpf() {
		return campoCpf;
	}
	
	public void runTest(Devices device) throws MalformedURLException {
		driver = new DriverFactory().getDriver(device);
		this.robot = new AuxRobot(driver);
	}

	public void clickGerarCpf(String nomeEvidencia) throws IOException {
		robot.findElement(gerarCpf).click();
	}

	public void clickValidar(String nomeEvidencia) throws IOException {
		robot.findElement(validarCpf).click();
	}

	public void inserirCpf(String nomeEvidencia, String cpfInvalido) throws IOException {
		robot.findElement(campoCpf).sendKeys(cpfInvalido);
	}

	public Boolean validarCpf() throws IOException {
		return robot.findElement(cpfSucesso).isDisplayed();
	}

	public void goToUrl(String url) {

		robot.goToUrl(url);

	}
}
