import java.util.ArrayList;
import java.util.List;

public class Lanche extends ItemCardapio {

    private List<String> ingredientes;

    public Lanche(String nome, double preco) {
        super(nome, preco);
        this.ingredientes = new ArrayList<>();
    }

    public void adicionarIngredientes(String ingrediente) {
        this.ingredientes.add(ingrediente);
    }

    @Override
    public double calcularPreco() {
        return preco + (ingredientes.size() * 1.5);
    }

    @Override
    public String descrever() {
        return "Lanche: " + nome + " | Ingredientes: " + ingredientes + " | Preço: R$" + calcularPreco();
    }
}
