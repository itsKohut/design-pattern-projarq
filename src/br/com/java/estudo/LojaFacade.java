package br.com.java.estudo;

import br.com.java.estudo.carrinho.CarrinhoDeCompras;
import br.com.java.estudo.carrinho.CarrinhoDeComprasGerenciador;
import br.com.java.estudo.pagamento.Pagamento;
import br.com.java.estudo.pagamento.PagamentoFactory;
import br.com.java.estudo.pagamento.TipoPagamento;
import br.com.java.estudo.produto.Estoque;
import br.com.java.estudo.produto.Produto;

public class LojaFacade {

    private CarrinhoDeCompras carrinho;
    private CarrinhoDeComprasGerenciador gerenciador;
    private Estoque estoque;

    public LojaFacade() {
        carrinho = CarrinhoDeCompras.getInstance();
        gerenciador = new CarrinhoDeComprasGerenciador();
        estoque = new Estoque();

        gerenciador.addObserver(carrinho);
    }

    public void addProdutoCarrinho(int produtoSelecionado, int quantidadeRequerida) {

        Produto produto = null;
        produto = estoque.escolheProduto(produtoSelecionado, quantidadeRequerida); // Faz o controle do estoque
        Produto produtoEscolhido = new Produto(produto.getId(), produto.getNome(), produto.getValor(), quantidadeRequerida);
        gerenciador.selectProduct(produtoEscolhido); // manda o produto que foi retirado do estoque para o carrinho

    }

    public void mostraCarrinho() {
        carrinho.mostrarCarrinho();
    }

    public void escolherMetodoPagamento(TipoPagamento tipoPagamento) {
        Pagamento pagamento = PagamentoFactory.selecionaPagamento(tipoPagamento);
        pagamento.metodoEscolhido();
    }
}
