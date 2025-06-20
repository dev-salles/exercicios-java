package arrays.classes;

import java.time.LocalDate;

public class ProdutoPerecivel extends Produto {
    private final LocalDate dataValidade;

    public ProdutoPerecivel(int id, String nome, double preco, int quantidade, LocalDate dataValidade) {
        super(id, nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        String baseString = super.toString();
        String trimmedBase = baseString.substring(0, baseString.length() - 1);
        return trimmedBase + ", Data de Validade = " + dataValidade + "]";
    }
}
