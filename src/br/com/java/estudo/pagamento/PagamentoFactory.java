package br.com.java.estudo.pagamento;

public class PagamentoFactory {

    public static Pagamento selecionaPagamento(TipoPagamento tipoPagamento) {

        Pagamento pagamento = null;

        switch (tipoPagamento) {
            case BOLETO:
                pagamento = new Boleto();
                break;

            case CREDTIO:
                pagamento = new Credito();
                break;

            case DEBITO:
                pagamento = new Debito();
                break;

            default:
                throw new IllegalArgumentException("Método pagamento inválido");
        }

        return pagamento;
    }
}
