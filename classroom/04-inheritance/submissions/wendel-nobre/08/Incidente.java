public class Incidente extends SolicitacaoAtendimento {
    private int impacto;
    private int urgencia;

    public Incidente(String protocolo, String descricao, int impacto, int urgencia) {
        super(protocolo, descricao);

        if (impacto < 1) {
            this.impacto = 1;
        } else if (impacto > 5) {
            this.impacto = 5;
        } else {
            this.impacto = impacto;
        }

        if (urgencia < 1) {
            this.urgencia = 1;
        } else if (urgencia > 5) {
            this.urgencia = 5;
        } else {
            this.urgencia = urgencia;
        }
    }

    public int getImpacto() {
        return impacto;
    }

    public int getUrgencia() {
        return urgencia;
    }

    @Override
    public int calcularPrioridade() {
        return impacto * urgencia;
    }
}