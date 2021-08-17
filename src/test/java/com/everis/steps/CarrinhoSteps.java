package com.everis.steps;

import io.cucumber.java.pt.E;
import org.junit.Assert;

import com.everis.pages.CarrinhoPage;

import io.cucumber.java.pt.Entao;

public class CarrinhoSteps {
	
	@Entao("^o produto \"(.*)\" deve estar presente no carrinho$")
	public void apresentouProdutoEsperadoNoCarrinho(String nomeProduto) {
		CarrinhoPage carrinhoPage = new CarrinhoPage();
		Assert.assertTrue("Deveria ter apresentado o produto [" + nomeProduto + "] no carrinho", 
				carrinhoPage.apresentouProdutoEsperadoNoCarrinho(nomeProduto));
	}

	@Entao("^o produto \"(.*)\" deve possuir a quantidade (.*)$")
	public void oProdutoApresentouQuantidadeEsperada(String nomeProduto,String quantidade) {
		CarrinhoPage carrinhoPage = new CarrinhoPage();
		Assert.assertTrue("O produto ["+nomeProduto+"]deveria ter a quantidade["+quantidade+"]",
				carrinhoPage.oProdutoApresentouQuantidadeEsperada(nomeProduto,quantidade));
	}


	@E("^acessa o checkout$")
	public void acessaOCheckout() {
		CarrinhoPage carrinhoPage = new CarrinhoPage();
		carrinhoPage.AcessarCheckout();
	}

	@E("^confirma o endereco de entrega$")
	public void confirmaEnderecoEntrega() {
		CarrinhoPage carrinhoPage = new CarrinhoPage();
		carrinhoPage.AcessarCheckoutAdress();
	}

	@E("^escolhe a forma de transporte$")
	public void escolheFormaTransporte(){
		CarrinhoPage carrinhoPage = new CarrinhoPage();
		carrinhoPage.escolherFormaTransporte();
	}
}