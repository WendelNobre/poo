public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome obrigatorio");
        }
        if (preco <= 0) {
            throw new IllegalArgumentException("O preço deve ser maior que zero");
        }
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String toString() {
        return nome + " - R$ " + String.format("%.2f", preco);
    }
}
