package br.com.java.estudo.produto;


public class Produto {

    private Integer id;
    private String nome;
    private Double valor;
    private int quantidade;

    public Produto(Integer id, String nome, Double valor, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Double getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int novaQuantidade) {
        this.quantidade = novaQuantidade;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Produto produto = (Produto) obj;
        return (id == produto.id) && (nome == produto.nome);
    }

    @Override
    public String toString() {
        return "id: " + id + " - Produto: " + nome + " - Preço: " + valor;
    }
}