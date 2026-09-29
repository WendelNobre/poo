public class PlanoAssinatura {
    private String nome;
    private double mensalidade;

    public PlanoAssinatura(String nome, double mensalidade) {
        if (nome == null || nome.trim().isEmpty()) {
            this.nome = "Plano sem nome";
        } else {
            this.nome = nome;
        }

        if (mensalidade < 0) {
            this.mensalidade = 0.0;
        } else {
            this.mensalidade = mensalidade;
        }
    }

    public String getNome() {
        return nome;
    }

    public double getMensalidade() {
        return mensalidade;
    }
}