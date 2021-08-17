package com.everis.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.everis.util.Hooks;

public class PagamentoPage extends BasePage{


    @FindBy(xpath = "//*[contains(@id, 'HOOK_PAYMENT')]//child::*[@class='bankwire']")
    protected WebElement botaoPagamentoTransferenciaBancaria;

    @FindBy(xpath = "//*[contains(@class,'button btn btn-default button-medium')]//*[contains(text(),'I confirm my order')]")
    protected WebElement botaoConfirmarPagamentoTransferenciaBancaria;

    @FindBy(xpath = "//*[contains(text(),'Your order on My Store is complete.')]")
    protected WebElement mensagemCompraFinalizada;

    public PagamentoPage(){
    	PageFactory.initElements(Hooks.getDriver(), this);
    }
    
    public void efetuarPagamentoTransferenciaBancaria(){
        botaoPagamentoTransferenciaBancaria.click();
        botaoConfirmarPagamentoTransferenciaBancaria.click();
        log("Efetuou o pagamento");
    }

    public boolean getMensagemCompraFinalizada() {
        return mensagemCompraFinalizada.isDisplayed();
    }
}
