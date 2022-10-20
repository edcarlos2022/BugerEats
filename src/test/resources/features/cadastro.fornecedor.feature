#Author: edcarlos20@hotmail.com
@regressao
Feature: Enviar formulario de cadastro de novos entregadores
como prestador de servicos quer enviar meus dados 
  
  Scenario: Cadastrar esntregador com moto
    When preencher com dados pessoais do entegador
    And preencher os dados do endereco do entregador
    But preencher o metodo de entrega com moto
    And anexar o documento do prestador
    Then enviamos o formulario
    And validamos a confirmacao

    Scenario: Cadastrar esntregador com moto
    When preencher com dados pessoais do entegador
    And preencher os dados do endereco do entregador
    But preencher o metodo de entrega com moto
    And anexar o documento do prestador
    Then enviamos o formulario
    And validamos a confirmacao
    
      Scenario: Cadastrar esntregador com bicicleta
    When preencher com dados pessoais do entegador
    And preencher os dados do endereco do entregador
    But preencher o metodo de entrega com bicicleta
    And anexar o documento do prestador
    Then enviamos o formulario
    And validamos a confirmacao
    
      Scenario: Cadastrar esntregador com carro/van
    When preencher com dados pessoais do entegador
    And preencher os dados do endereco do entregador
    But preencher o metodo de entrega com carro/van
    And anexar o documento do prestador
    Then enviamos o formulario
    And validamos a confirmacao
    