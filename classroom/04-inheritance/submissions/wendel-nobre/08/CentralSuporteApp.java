public class CentralSuporteApp {
    public static void main(String[] args) {
        SolicitacaoAtendimento incidente = new Incidente("INC-202601", "Queda no servidor de banco de dados", 5, 4);
        SolicitacaoAtendimento solicitacaoServico = new SolicitacaoServico("SRV-202602", "Instalação de software para a equipe", 120);

        CentralSuporte central = new CentralSuporte();

        System.out.println("--- Processando Solicitações de Suporte ---");
        central.processar(incidente);
        central.processar(solicitacaoServico);
    }
}