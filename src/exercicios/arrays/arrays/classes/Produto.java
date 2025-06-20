package arrays.classes;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Produto {
    private final int id;
    private final String nome;
    private final double preco;
    private final int quantidade;

    public Produto(int id, String nome, double preco, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getPreco() {
        BigDecimal bd = new BigDecimal(preco);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return String.format("%.2f", bd);
    }



    @Override
    public String toString() {
        return  "Produto" + id + " [nome=" + nome + ", preco=" + getPreco() + ", quantidade=" + quantidade + "]";
    }
}
