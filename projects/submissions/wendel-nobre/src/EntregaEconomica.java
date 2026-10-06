public class EntregaEconomica extends Entrega {
    public EntregaEconomica(Pedido pedido, String endereco) {
        super(pedido, endereco);
    }

    public double calcularFrete() {
        if (getPedido().calcularTotal() >= 100) {
            return 0;
        } else {
            return 10;
        }
    }

    public String getTipo() {
        return "Economica";
    }

    public String toString() {
        return "Entrega " + getTipo() + " - R$ " + String.format("%.2f", calcularFrete());
    }
}
