package br.com.java.estudo.carrinho;

import br.com.java.estudo.produto.Produto;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeComprasGerenciador { // implementação do observer

    private Produto selectedProduto;
    private List<Observer> observers;

    public CarrinhoDeComprasGerenciador() {
        observers = new ArrayList<>();
    }
    public void addObserver(CarrinhoDeCompras carrinhoDeCompras){
        observers.add(carrinhoDeCompras);
    }

    public void selectProduct(Produto produto) {
        this.selectedProduto = produto;
        notifyObservers();
    }

    public void notifyObservers(){
        for( Observer observer : observers) {
            observer.addToCart(this.selectedProduto);
        }
    }
}
