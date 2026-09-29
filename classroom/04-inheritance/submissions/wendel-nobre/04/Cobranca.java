public class Cobranca {
    private String descricao;
    private double valorBase;

    public Cobranca(String descricao, double valorBase) {
        if (descricao == null || descricao.trim().isEmpty()) {
            this.descricao = "Cobrança sem descrição";
        } else {
            this.descricao = descricao;
        }

        if (valorBase < 0) {
            this.valorBase = 0.0;
        } else {
            this.valorBase = valorBase;
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValorBase() {
        return valorBase;
    }

    public double calcularTotal() {
        return valorBase;
    }
}