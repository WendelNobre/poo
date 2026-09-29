public class CentralSuporte {

    public void processar(SolicitacaoAtendimento solicitacao) {
        System.out.println("Protocolo: " + solicitacao.getProtocolo());
        System.out.println("Descrição: " + solicitacao.getDescricao());
        System.out.println("Prioridade: " + solicitacao.calcularPrioridade());
        System.out.println("----------------------------------------");
    }
}