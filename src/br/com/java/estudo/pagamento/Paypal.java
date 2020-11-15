package br.com.java.estudo.pagamento;

public class Paypal implements Pagamento{

    @Override
    public void metodoEscolhido() {
        System.out.println("Opção de pagamento selecionada: PAYPAL");
    }
    
}
