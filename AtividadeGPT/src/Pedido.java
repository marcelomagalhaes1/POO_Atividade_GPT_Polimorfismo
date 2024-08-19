import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private List<ItemCardapio> itens;

    public Pedido() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemCardapio item) {
        itens.add(item);
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemCardapio item : itens) {
            total += item.calcularPreco();
        }
        return total;
    }

    public void pedido() {
        for (ItemCardapio item : itens) {
            System.out.println(item.descrever());
        }
        System.out.println("Total do pedido: R$" + calcularTotal());
    }
}
