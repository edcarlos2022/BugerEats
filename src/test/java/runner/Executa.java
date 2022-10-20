package runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

import drivers.driversFactory;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = "steps",
		tags ="@regressao",
		monochrome = true,
		dryRun = false, // alterar para false quando rodar o teste
		plugin = {"pretty","html:target/cucumber-report.html"},
		snippets = SnippetType.CAMELCASE
		
		)

public class Executa extends driversFactory {
	
	public void abrirNavegador(){
	String site = "https://buger-eats.vercel.app/deliver\r\n";
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(site);
	System.out.println("*********iniciando teste********");
	}
	public static void fecharNavegador() {
		driver.quit();
	System.out.println("*********iniciando teste********");
	}
}
