package Metodos;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import drivers.driversFactory;

public class Metodos extends driversFactory{
	
	public void escrever (By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);	
	}
public void clicar(By elemento) {
	driver.findElement(elemento).click();
	
}

public void upLoad(String path, int time) {
	try {
		Robot robot = new Robot();
		robot.delay(time);
		StringSelection ss = new StringSelection(path);
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    robot.keyRelease(KeyEvent.VK_V);
	    robot.delay(time);
	    
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	    robot.delay(time);
	    
	    /*public void fileUpload(By elemento) {
			
			File file = new File("./Files/cnh.jpg");
			driver.findElement(elemento).sendKeys(file.getAbsolutePath());

	}*/

	} catch (Exception e) {
		System.out.println("NAO FOI POSSIVEL ANEXAR O ARQUIVO DESEJADO");
		e.printStackTrace();
	}
}
	public void screenShot(String nomeEvidencia) {
		TakesScreenshot srcShot = (TakesScreenshot) driver;
		File srcFile = srcShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File ("./evidencias/"+ nomeEvidencia +".png");
		
		try {
			FileUtils.copyFile(srcFile, destFile);
			} catch (IOException e) {
			System.err.println("********** Erro ao Tirar foto *********");
			e.printStackTrace();
				
		}
	}
		public String gerarNome(int letras) {
			String nomeGerado = RandomStringUtils.randomAlphabetic(letras);
			String nome = "Jhon" + nomeGerado;
			return nome.toLowerCase();
			
		}
	public String gerarEmail(int letras) {
		String emailGerado = RandomStringUtils.randomAlphabetic(letras);
		String email = "john"+ emailGerado+"@teste.com.br";
		return email.toLowerCase();
	}

}
