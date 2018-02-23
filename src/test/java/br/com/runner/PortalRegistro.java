package br.com.runner;

import org.junit.Test;

import br.com.button.Button;
import br.com.button.InitializeTest;
import br.com.pageobject.ButtonPage;
import br.com.pageobject.PortalRegistroPage;

public class PortalRegistro implements InitializeTest{

	
	@Test
	public void test() {
		PortalRegistroPage registro = new PortalRegistroPage();
		ButtonPage button = new ButtonPage();
		registro.navigate("http://10.59.164.13/portal/#/registro");
		registro.setCpf("05632365409");
		registro.setEmail("ronaldo.silva@userede.com");
		registro.setNome("mapelli");
		registro.setTelefone("11987653452");
		Button.click(button.btnContinuar);
	}
}
