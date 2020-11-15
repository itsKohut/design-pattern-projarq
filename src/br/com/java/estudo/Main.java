package br.com.java.estudo;

import br.com.java.estudo.pagamento.TipoPagamento;

public class Main {

    public static void main(String[] args) {

        LojaFacade lojaFacade = new LojaFacade();

        lojaFacade.addProdutoCarrinho(1, 2); // valores chumbados, o ideal seria ter um switch case para o usuário escolher
        lojaFacade.addProdutoCarrinho(3, 4); // valores chumbados, o ideal seria ter um switch case para o usuário escolher
        lojaFacade.addProdutoCarrinho(5, 6); // valores chumbados, o ideal seria ter um switch case para o usuário escolher

        lojaFacade.mostraCarrinho();

        lojaFacade.escolherMetodoPagamento(TipoPagamento.BOLETO);

    }
}
