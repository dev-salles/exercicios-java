import arrays.classes.Produto;
import arrays.classes.ProdutoPerecivel;

import java.time.LocalDate;
import java.util.ArrayList;

public class ArrayMain {
    public static void main(String[] args) {
        ArrayList<Produto> listaDeProdutos = new ArrayList<>();

        Produto p1 = new Produto(1, "Escova de Dente", 5.97, 2);
        Produto p2 = new Produto(2, "Pasta de Dente", 18.9, 2);
        Produto p3 = new Produto(3, "Doritos Dynamite", 18.9, 2);

        listaDeProdutos.add(p1);
        listaDeProdutos.add(p2);
        listaDeProdutos.add(p3);

        ProdutoPerecivel pPerecivel1 = new ProdutoPerecivel(1, "Alface", 2.2, 3, LocalDate.of(2025, 6, 30));
        System.out.println(pPerecivel1);


        for (Produto produto : listaDeProdutos) {
            System.out.println(produto);
        }
    }
}
