public class EntregaExpressa extends Entrega {
    public EntregaExpressa(Pedido pedido, String endereco) {
        super(pedido, endereco);
    }

    public double calcularFrete() {
        return 20;
    }

    public String getTipo() {
        return "Expressa";
    }

    public String toString() {
        return "Entrega " + getTipo() + " - R$ " + String.format("%.2f", calcularFrete());
    }
}
