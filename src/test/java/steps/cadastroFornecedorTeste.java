package steps;

import Metodos.Metodos;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.cadastroFornecedorPage;
import runner.Executa;

public class cadastroFornecedorTeste extends Executa {
	Executa executa = new Executa();
	cadastroFornecedorPage cadastrar = new cadastroFornecedorPage();
	Metodos metodos = new Metodos();

	@When("preencher com dados pessoais do entegador")
	public void preencherComDadosPessoaisDoEntegador() {
		executa.abrirNavegador();
		cadastrar.preencherDadosPessoais("ed carlos da silva", "38254445566", "ed@CARLOS2221HOTMAIL", "11999996999");	
	}
	@When("preencher os dados do endereco do entregador")
	public void preencherOsDadosDoEnderecoDoEntregador() {
		cadastrar.preencherDadosDeEndereco("07791075", "555", "terreo sala 3");
	}
	@When("preencher o metodo de entrega com moto")
	public void preencherOMetodoDeEntregaComMoto() {
		cadastrar.escolherMetodoDeEntrega("moto");
	}
	
	@When("preencher o metodo de entrega com carro\\/van")
	public void preencherOMetodoDeEntregaComCarroVan() {
		cadastrar.escolherMetodoDeEntrega("Van");
	}
	@When("preencher o metodo de entrega com bicicleta")
	public void preencherOMetodoDeEntregaComBicicleta() {
		cadastrar.escolherMetodoDeEntrega("bike");
	}
	@When("anexar o documento do prestador")
	public void anexarODocumentoDoPrestador() {
	cadastrar.anexarCnh("C:\\Users\\Usuario\\Desktop\\habilitacao");
	}
	@Then("enviamos o formulario")
	public void enviamosOFormulario() {
		cadastrar.enviarFormulario();
	}
	@Then("validamos a confirmacao")
	public void validamosAConfirmacao() {
		metodos.screenShot("evidenciaMoto");
		Executa.fecharNavegador();
	}
}
