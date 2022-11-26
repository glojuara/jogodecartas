package br.com.ada;

import br.com.ada.livraria.model.Carrinho;
import br.com.ada.livraria.model.Livro;
import br.com.ada.livraria.model.Produto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> lista = new ArrayList<>(2);

        Produto p1 = new Livro();
        p1.setId(1);
        p1.setPreco(BigDecimal.TEN);


        Carrinho carrinho = new Carrinho();
        carrinho.adicionarItem(p1);
        carrinho.adicionarItem(p1);
        carrinho.adicionarItem(p1);
        carrinho.removerProduto(p1);

        carrinho.obterItemsDoCarrinho().entrySet().stream()
                .forEach(e -> {
                    System.out.println(e.getValue() + " x " + e.getKey().getPreco() + " = " );
                });

    }

}