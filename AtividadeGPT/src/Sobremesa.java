public class Sobremesa extends ItemCardapio{

    private String tamanhoPorcao;
    private double contagemCalorias;

    public Sobremesa(String nome, double preco, String tamanhoPorcao, double contagemCalorias) {
        super(nome, preco);
        this.tamanhoPorcao = tamanhoPorcao;
        this.contagemCalorias = contagemCalorias;
    }

    @Override
    public double calcularPreco() {
        switch (tamanhoPorcao) {
            case "médio":
                return preco + 1.5;
            case "grande":
                return preco + 2.5;
            case "pequeno":
                return preco;
            default:
                throw new IllegalArgumentException("Tamanho inválido: " + tamanhoPorcao);
        }
    }

    @Override
    public String descrever() {
        return "Sobremesa: " + nome + " | Tamanho da Porção: " + tamanhoPorcao + " | Quantidade de calorias: " + contagemCalorias;
    }
}
