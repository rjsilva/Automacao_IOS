package br.com.runner;

import org.junit.Assert;
import org.junit.Test;

import br.com.button.Button;
import br.com.button.InitializeTest;
import br.com.pageobject.ButtonPage;
import br.com.pageobject.CpfPage;

public class GerarCpf implements InitializeTest{

	private static CpfPage cpf ;
  
	@Test
	public void test(){
		cpf = new CpfPage();
		cpf.navigate();
	    Button.click(ButtonPage.btnGerarCpf);
	    Button.click(ButtonPage.btnValidarCpf);
	    Assert.assertTrue(cpf.getCpfStatus());
	}
	

}
