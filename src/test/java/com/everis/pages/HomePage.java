package com.everis.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.everis.util.Hooks;

public class HomePage extends BasePage {

	@FindBy(css = "#search_query_top")
	protected WebElement campoBusca;
	
	@FindBy(name = "submit_search")
	protected WebElement botaoLupaBuscar;

	@FindBy(xpath = "//*[@id='SubmitLogin']")
	protected WebElement botaoRealizarLogin;

	@FindBy(xpath = "//*[@id='email']")
	protected WebElement campoEmail;

	@FindBy(xpath = "//*[@id='passwd']")
	protected WebElement campoPassword;

	public HomePage() {
		PageFactory.initElements(Hooks.getDriver(), this);
	}

	public void pesquisarProduto(String nomeProduto) {

		campoBusca.sendKeys(nomeProduto);
		botaoLupaBuscar.click();
		log("Pesquisou pelo produto: " + nomeProduto);
	}

	public void realizarLogin(){
		campoEmail.sendKeys("femahi2020@gmail.com");
		campoPassword.sendKeys("teste");
		botaoRealizarLogin.click();
		log("Realizou o login");
	}


}