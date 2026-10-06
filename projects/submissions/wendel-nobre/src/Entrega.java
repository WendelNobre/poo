public abstract class Entrega {
    private Pedido pedido;
    private String endereco;

    public Entrega(Pedido pedido, String endereco) {
        if (pedido == null) {
            throw new IllegalArgumentException("Pedido obrigatorio");
        }
        if (endereco == null || endereco.isBlank()) {
            throw new IllegalArgumentException("Endereço obrigatorio");
        }
        this.pedido = pedido;
        this.endereco = endereco;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public String getEndereco() {
        return endereco;
    }

    public abstract double calcularFrete();
    public abstract String getTipo();
}
