import java.io.IOException;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import br.com.action.InitializeTest;
import br.com.pageobject.GerarCpfPage;
import br.com.util.Devices;
import br.com.util.InitializeServer;

public class GerarCpfValido implements InitializeTest {

	private GerarCpfPage gerarCpfPage = null;

	private WebDriver driver = null;


	@Before
	public void start() {

		new InitializeServer().statrtServer();
	}

	@Test
	public void test() {

		try {
			gerarCpfPage = new GerarCpfPage();
			gerarCpfPage.runTest(Devices.IOS);
			String url = "https://www.geradordecpf.org/";
			gerarCpfPage.goToUrl(url);
			gerarCpfPage.clickGerarCpf("gerarcpfsucesso");
			gerarCpfPage.clickValidar("validacpfsucesso");
			Assert.assertTrue(gerarCpfPage.validarCpf());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@After
	public void finish() {
		new InitializeServer().stopServer();
	}

}
