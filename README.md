# Sistema Bancário em Java

Este projeto é um sistema bancário simples feito em Java para fins educacionais. Ele permite o cadastro e login de um cliente, além de operações básicas como saque, depósito e consulta de saldo.

## Funcionalidades

Cadastro de cliente com nome, email, senha e CPF  
Login com validação de email e senha  
Depósito de valores com validação  
Saque de valores com verificação de saldo  
Visualização do saldo atual

## Como funciona

Ao executar o programa, o usuário tem a opção de entrar no banco ou sair  
Caso escolha entrar, ele faz o cadastro e realiza o login com os dados inseridos  
Após o login, o cliente acessa o menu de operações bancárias  
As opções disponíveis são sacar, depositar, ver saldo ou sair da conta

## Estrutura do projeto

ContaBancaria.java  
Contém o método principal e gerencia o menu principal e as operações

Cliente.java  
Responsável por coletar os dados do cliente, realizar o cadastro e fazer o login

Transacao.java  
Controla o saldo e realiza operações de saque, depósito e exibe o extrato

## Requisitos

Java instalado na máquina  
IntelliJ IDEA, Eclipse ou outro editor compatível

## Objetivo

Este projeto tem como objetivo treinar a lógica de programação orientada a objetos em Java, utilizando classes, métodos, entrada de dados e controle de fluxo
