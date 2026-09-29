public class Entrega {
    private double distancia;
    private double peso;

    public Entrega(double distancia, double peso) {
        if (distancia < 0) {
            this.distancia = 0;
        } else {
            this.distancia = distancia;
        }

        if (peso < 0) {
            this.peso = 0;
        } else {
            this.peso = peso;
        }
    }

    public double getDistancia() {
        return distancia;
    }

    public double getPeso() {
        return peso;
    }

    public double calcularFrete() {
        return (distancia * 0.50) + (peso * 1.00);
    }

    public int calcularPrazo() {
        int dias = (int) Math.ceil(distancia / 100.0);
        if (dias < 1) {
            return 1;
        }
        return dias;
    }

    public String getDescricao() {
        return "Entrega Convencional";
    }
}