public class Bebida extends ItemCardapio {

    private String tamanho;
    private String temperatura;

    public Bebida(String nome, double preco, String tamanho, String temperatura) {
        super(nome, preco);
        this.tamanho = tamanho;
        this.temperatura = temperatura;
    }

    @Override
    public double calcularPreco() {
        switch (tamanho) {
            case "médio":
                return preco + 1.5;
            case "grande":
                return preco + 2.5;
            case "pequeno":
                return preco;
            default:
                throw new IllegalArgumentException("Tamanho inválido: " + tamanho);
        }
    }

    @Override
    public String descrever() {
        return "Bebida: " + nome + " | Tamanho: " + tamanho + " | Quente ou Frio? " + temperatura + " | Valor: R$" + calcularPreco();
    }
}
