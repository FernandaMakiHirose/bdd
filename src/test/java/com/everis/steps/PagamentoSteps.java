package com.everis.steps;

import com.everis.pages.PagamentoPage;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

public class PagamentoSteps {

    @Quando("^o pagamento for confirmado$")
    public void pagamentoBancario(){
        PagamentoPage pagamentoPage = new PagamentoPage();
        pagamentoPage.efetuarPagamentoTransferenciaBancaria();
        System.out.println("Pagamento Bancario");
        Assert.assertTrue("Your order on My Store is complete.",pagamentoPage.getMensagemCompraFinalizada());
    }

    @Entao("^deve ser apresentado a mensagem Your order on my Store is complete$")
    public void mensagemPedidoEfetuado(){
        System.out.println("Your order on My Store is complete.");
    }
}
