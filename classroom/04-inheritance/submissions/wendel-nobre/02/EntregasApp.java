public class EntregasApp {
    public static void main(String[] args) {
        double distancia = 250.0;
        double peso = 10.0;

        Entrega entregaComum = new Entrega(distancia, peso);
        EntregaExpressa entregaExpressa = new EntregaExpressa(distancia, peso);

        System.out.println("--- " + entregaComum.getDescricao() + " ---");
        System.out.println("Frete: R$ " + entregaComum.calcularFrete());
        System.out.println("Prazo: " + entregaComum.calcularPrazo() + " dia(s)");

        System.out.println("\n--- " + entregaExpressa.getDescricao() + " ---");
        System.out.println("Frete: R$ " + entregaExpressa.calcularFrete());
        System.out.println("Prazo: " + entregaExpressa.calcularPrazo() + " dia(s)");
    }
}