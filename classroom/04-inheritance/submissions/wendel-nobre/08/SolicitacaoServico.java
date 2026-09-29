public class SolicitacaoServico extends SolicitacaoAtendimento {
    private int usuariosAfetados;

    public SolicitacaoServico(String protocolo, String descricao, int usuariosAfetados) {
        super(protocolo, descricao);

        if (usuariosAfetados < 0) {
            this.usuariosAfetados = 0;
        } else {
            this.usuariosAfetados = usuariosAfetados;
        }
    }

    public int getUsuariosAfetados() {
        return usuariosAfetados;
    }

    @Override
    public int calcularPrioridade() {
        int prioridade = 1 + (usuariosAfetados / 10);
        if (prioridade > 25) {
            return 25;
        }
        return prioridade;
    }
}