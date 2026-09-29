public abstract class SolicitacaoAtendimento {
    private String protocolo;
    private String descricao;

    public SolicitacaoAtendimento(String protocolo, String descricao) {
        if (protocolo == null || protocolo.trim().isEmpty()) {
            this.protocolo = "PROTOCOLO-INVALIDO";
        } else {
            this.protocolo = protocolo;
        }

        if (descricao == null || descricao.trim().isEmpty()) {
            this.descricao = "Sem descrição";
        } else {
            this.descricao = descricao;
        }
    }

    public String getProtocolo() {
        return protocolo;
    }

    public String getDescricao() {
        return descricao;
    }

    public abstract int calcularPrioridade();
}