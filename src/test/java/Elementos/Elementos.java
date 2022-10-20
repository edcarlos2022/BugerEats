package Elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	public By nomeCompleto = By.name("name");
	public By cpf = By.name("cpf");
	public By email = By.name("email");
	public By whatsApp = By.name("whatsapp");
	
	
	public By cep = By.name("postalcode");
	public By btnBuscarCep = By.xpath("//input[@type='button']");
	public By numero = By.name("address-number");
	public By complemento = By.name("address-details");
	

	public By moto = By.xpath("//img[@alt='Moto']");
	public By bike = By.xpath("//img[@alt='Bicicleta']");
	public By carro = By.xpath("//img[@alt='Van/Carro']");

	public By cnh = By.xpath("//*[text()='Foto da sua CNH']");
	public By btnEnviar = By.xpath("//button[@class='button-success']");

}
