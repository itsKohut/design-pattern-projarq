package br.com.java.estudo;

import br.com.java.estudo.pagamento.TipoPagamento;

public class Main {

    public static void main(String[] args) {

        LojaFacade lojaFacade = new LojaFacade();

        lojaFacade.addProdutoCarrinho(1, 2);
        lojaFacade.addProdutoCarrinho(3, 4);
        lojaFacade.addProdutoCarrinho(5, 6);

        lojaFacade.mostraCarrinho();

        lojaFacade.escolherMetodoPagamento(TipoPagamento.BOLETO);

    }
}
