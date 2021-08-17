package com.everis.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.everis.util.Hooks;

public class CarrinhoPage extends BasePage {

	@FindBy(xpath = "//*[@class='button btn btn-default standard-checkout button-medium'][@title='Proceed to checkout']")
	protected WebElement botaoAcessarCheckout;

	@FindBy(xpath = "//*[@class='button btn btn-default standard-checkout button-medium'][@name='processCarrier']")
	protected WebElement botaoAcessarCheckoutShipping;

	@FindBy(xpath = "//*[@class='button btn btn-default button-medium'][@name='processAddress']")
	protected WebElement botaoAcessarCheckoutAdress;

	@FindBy(xpath = "//*[@class='delivery_option_radio'][@checked='checked']")
	protected WebElement checkMyCarrier;

	@FindBy(xpath = "//*[@id='cgv'][@name='cgv']")
	protected WebElement checkTermsService;

	public CarrinhoPage() {
		PageFactory.initElements(Hooks.getDriver(), this);
	}
	
	public boolean apresentouProdutoEsperadoNoCarrinho(String nomeProduto) {
		boolean apresentouProdutoEsperadoNoCarrinho = isElementDisplayed(By.xpath(
				"//*[contains(@class,'cart_item')]//a[text()='" + nomeProduto + "']"));

		if (apresentouProdutoEsperadoNoCarrinho) {
			log("Apresentou o produto [" + nomeProduto + "] no carrinho conforme esperado.");
			return true;
		}
		logFail("Deveria ter apresentado o produto [" + nomeProduto + "] no carrinho.");
		return false;
	}

	public boolean oProdutoApresentouQuantidadeEsperada(String nomeProduto,String quantidadeProdutoEsperada){
		WebElement quantidadeProduto = driver.findElement(By.xpath("//*[text()='"+nomeProduto+"'" +
				"]//ancestor::*[contains(@class, 'cart_item')]" +
				"//*[contains(@class, 'cart_quantity_input')]"));
		boolean oProdutoApresentouQuantidadeEsperada =
				quantidadeProdutoEsperada.equals(quantidadeProduto.getAttribute("value"));
		if (oProdutoApresentouQuantidadeEsperada){
			log("Apresentou a quantidade esperada do produto");
			return true;
		}
		log("Não apresentou a quantidade esperada do produto");
		return false;
	}

	public void AcessarCheckout(){
		botaoAcessarCheckout.click();
		log("Clicou em Checkout");
	}

	public void AcessarCheckoutAdress(){
		botaoAcessarCheckoutAdress.click();
		log("Clicou em Checkout Adress");
	}

	public void escolherFormaTransporte(){
		checkMyCarrier.click();
		checkTermsService.click();
		botaoAcessarCheckoutShipping.click();
		log("Escolheu a forma de transporte");
	}



}