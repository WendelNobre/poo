public class CobrancasApp {
    public static void main(String[] args) {
        Cobranca produto = new CobrancaProduto("Notebook Dell", 3000.00);
        Cobranca servico = new CobrancaServico("Manutenção Preventiva", 500.00);

        ProcessadorCobrancas processador = new ProcessadorCobrancas();

        System.out.println("--- Processando Cobranças ---");
        processador.processar(produto);
        processador.processar(servico);
    }
}