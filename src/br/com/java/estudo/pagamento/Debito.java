package br.com.java.estudo.pagamento;

public class Debito implements Pagamento {

    @Override
    public void metodoEscolhido() {
        System.out.println("Opção de pagamento selecionada: DÉBITO");
    }
}
