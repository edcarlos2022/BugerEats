package page;

import Elementos.Elementos;
import Metodos.Metodos;

public class cadastroFornecedorPage {

	Metodos metodos = new Metodos();
	Elementos el = new Elementos();

	public void preencherDadosPessoais(String nomeCompleto, String cpf, String email, String whatsapp) {
		metodos.escrever(el.nomeCompleto, nomeCompleto);
		metodos.escrever(el.cpf, cpf);
		metodos.escrever(el.email, email);
		metodos.escrever(el.whatsApp, whatsapp);

	}

	public void preencherDadosDeEndereco(String cep, String numero, String complemento) {
		metodos.escrever(el.cep, cep);
		metodos.clicar(el.btnBuscarCep);
		metodos.escrever(el.numero, numero);
		metodos.escrever(el.complemento, complemento);
	}

	public void escolherMetodoDeEntrega(String metodo) {
		
		if(metodo.equalsIgnoreCase("moto")) {
		metodos.clicar(el.moto);
	}else if(metodo.equalsIgnoreCase("bike")){
		metodos.clicar(el.bike);
	}else if(metodo.equalsIgnoreCase("carro")){
		metodos.clicar(el.carro);
	}else {
		System.out.println("*****Metodo invalido: digite moto ou bike ou carro");
		
	}
	}

	public void anexarCnh(String path) {
	metodos.clicar(el.cnh);
	metodos.upLoad("C:\\Users\\Usuario\\Desktop\\habilitacao", 1000);
	}

	public void enviarFormulario() {
		metodos.clicar(el.btnEnviar);
	}
	
}
