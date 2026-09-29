public class ProcessadorCobrancas {

    public void processar(Cobranca cobranca) {
        System.out.println("Descrição: " + cobranca.getDescricao());
        System.out.printf("Valor Total: R$ %.2f\n", cobranca.calcularTotal());
        System.out.println("----------------------------------------");
    }
}