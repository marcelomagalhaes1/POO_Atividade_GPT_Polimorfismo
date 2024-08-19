import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pedido pedido = new Pedido();

        Bebida cafe = new Bebida("Café", 3.0, "pequeno", "quente");
        Lanche sanduiche = new Lanche("Sanduíche", 6.5);
        sanduiche.adicionarIngredientes("Mussarela");
        sanduiche.adicionarIngredientes("Presunto");

        Sobremesa bolo = new Sobremesa("Bolo de Chocolate", 4.0, "médio", 350);

        pedido.adicionarItem(cafe);
        pedido.adicionarItem(sanduiche);
        pedido.adicionarItem(bolo);

        pedido.pedido();

        while (true) {
            System.out.println("\n1. Sair");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Saindo.. ");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida: ");
            }
        }
    }
}