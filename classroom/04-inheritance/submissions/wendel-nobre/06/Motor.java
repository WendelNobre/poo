public class Motor {
    private String combustivel;
    private double potencia;

    public Motor(String combustivel, double potencia) {
        if (combustivel == null || combustivel.trim().isEmpty()) {
            this.combustivel = "Gasolina";
        } else {
            this.combustivel = combustivel;
        }

        if (potencia < 0) {
            this.potencia = 0.0;
        } else {
            this.potencia = potencia;
        }
    }

    public String getCombustivel() {
        return combustivel;
    }

    public double getPotencia() {
        return potencia;
    }

    public String getDescricao() {
        return "Motor " + combustivel + " " + potencia + " cv";
    }
}