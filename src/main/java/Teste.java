import java.io.IOException;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecuteResultHandler;
import org.apache.commons.exec.DefaultExecutor;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import br.com.pageobject.GerarCpfPage;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Teste{


	private static WebDriver driver;
	private static GerarCpfPage gerarCpfPage = null;
	
	@Test
	public void main() throws IOException {
		// TODO Auto-generated method stub
        startServer();
		DesiredCapabilities capability = new DesiredCapabilities();
		//File file = new File("/MacintoshHD/Applications/Xcode.app");
		capability.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone");
		capability.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.IOS);
		capability.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.3");
		capability.setCapability(MobileCapabilityType.BROWSER_NAME, "safari");
		capability.setCapability(MobileCapabilityType.UDID, "2d75fa0a3dbb839ec3daa5166060296e4f69450a");
		//capability.setCapability(MobileCapabilityType.APP, file.getAbsolutePath());
		//driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capability);
		driver = new IOSDriver(capability);
		driver.get("https://www.geradordecpf.org/");
		//gerarCpfPage = new GerarCpfPage(driver);
		//gerarCpfPage = new GerarCpfPage(driver);
		gerarCpfPage.clickGerarCpf("gerarcpfsucesso");
		gerarCpfPage.clickValidar("validacpfsucesso");
		Assert.assertTrue(gerarCpfPage.validarCpf());
		driver.close();
	    stopServer();
	}
	public static void startServer() {

		CommandLine command = new CommandLine(
				"/Applications/Appium.app/Contents/Resources/node/bin/node");
		command.addArgument(
				"/Applications/Appium.app/Contents/Resources/node_modules/appium/bin/appium.js",
				false);
		command.addArgument("--address", false);
		command.addArgument("127.0.0.1");
		command.addArgument("--port", false);
		command.addArgument("4723");
		command.addArgument("--full-reset", false);
		command.addArgument("wd");
		command.addArgument("hub");
		DefaultExecuteResultHandler resultHandler = new DefaultExecuteResultHandler();
		DefaultExecutor executor = new DefaultExecutor();
		executor.setExitValue(1);
		try {
			executor.execute(command, resultHandler);
			Thread.sleep(5000);
			System.out.println("Appium server started.");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void stopServer() {
		String[] command = { "/usr/bin/killall", "-KILL", "node" };
		try {
			Runtime.getRuntime().exec(command);
			System.out.println("Appium server stopped.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
