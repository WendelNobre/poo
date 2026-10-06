public class ItemPedido {
    private Produto produto;
    private int quantidade;

    public ItemPedido(Produto produto, int quantidade) {
        if (produto == null) {
            throw new IllegalArgumentException("Produto obrigatorio");
        }
        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade deve ser maior que zero");
        }
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getTotal() {
        return produto.getPreco() * quantidade;
    }

    public String toString() {
        return quantidade + "x " + produto.getNome() + " - R$ " + String.format("%.2f", getTotal());
    }
}
