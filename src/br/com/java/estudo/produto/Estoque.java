package br.com.java.estudo.produto;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

    private List<Produto> produtos;

    public Estoque() {

        produtos = new ArrayList<>();

        produtos.add(new Produto(1, "Livro", 50.0, 10));
        produtos.add(new Produto(2, "Monitor", 500.0, 10));
        produtos.add(new Produto(3, "Notebook", 3000.0, 10));
        produtos.add(new Produto(4, "Borracha", 1.0, 10));
        produtos.add(new Produto(5, "Post-it", 5.0, 10));
        produtos.add(new Produto(6, "Celular", 1000.0, 10));
    }

    public Produto escolheProduto(int opcaoSelecionada, int quantidade) {

        mostrarEstoque(); // poderia ter um switch case aqui caso fosse nessário o usuário escolher a quantidade e o item.

        Produto produto = produtos.stream()
                .filter(p -> p.getId() == opcaoSelecionada)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Opção de produto inválida"));

        retirarProduto(produto, quantidade);

        System.out.println("Opção escolhida foi o produto com id " + opcaoSelecionada);
        System.out.println("Quantidade requerida para este produto foi " + quantidade);

        return produto;
    }

    private void retirarProduto(Produto produto, Integer quantidadeRetirada) {

        Integer atual = produto.getQuantidade();

        if (atual >= quantidadeRetirada) {
            produto.setQuantidade(atual - quantidadeRetirada);
        } else {
            throw new IllegalArgumentException("Quantidade de produtos solicitadas é maior do que há no estoque de produtos");
        }
    }

    private void mostrarEstoque() {
        System.out.println("\n============================== ESTOQUE ======================================");

        produtos.forEach(produto -> System.out.println(produto));

        System.out.println("==============================================================================\n");

    }
}
