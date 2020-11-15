package br.com.java.estudo.carrinho;

import br.com.java.estudo.produto.Produto;

import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompras implements Observer { // implementação do observer

    public static CarrinhoDeCompras INSTANCIA = null;
    public Map<Integer, Produto> produtosCarrinho = new HashMap<>();

    public static CarrinhoDeCompras getInstance() {

        if (INSTANCIA == null) {
            INSTANCIA = new CarrinhoDeCompras();
        }
        return INSTANCIA;
    }

    @Override
    public void addToCart(Produto produto) {

        if (produtosCarrinho.containsKey(produto.getId())) {
            Produto produtoDoCarrinho = produtosCarrinho.get(produto.getId());
            int quantidadeAtualizada = produto.getQuantidade() + produtoDoCarrinho.getQuantidade();
            produtoDoCarrinho.setQuantidade(quantidadeAtualizada);
            produtosCarrinho.put(produto.getId(), produtoDoCarrinho);
        } else {
            produtosCarrinho.put(produto.getId(), produto);
        }
    }

    public void mostrarCarrinho() {

        System.out.println("\n===================== CARRINHO DE COMPRAS ===================================");

        produtosCarrinho.entrySet().forEach(entry -> {
            System.out.println("Produto: " + entry.getValue().getNome() + " - " +
                    "Valor: R$ " + entry.getValue().getValor() + " - " +
                    "Quantidade: " + entry.getValue().getQuantidade());
        });

        System.out.println("==============================================================================\n");

    }
}
