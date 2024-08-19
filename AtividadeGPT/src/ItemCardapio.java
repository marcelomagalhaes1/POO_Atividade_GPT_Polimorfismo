public abstract class ItemCardapio {

    protected String nome;
    protected double preco;

    public ItemCardapio(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public abstract double calcularPreco();

    public abstract String descrever();

}
