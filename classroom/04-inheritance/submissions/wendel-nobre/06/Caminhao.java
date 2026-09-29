
public class Caminhao extends Veiculo {
    private double capacidadeCarga;

    public Caminhao(String placa, String combustivel, double potencia, double capacidadeCarga) {
        super(placa, combustivel, potencia);

        if (capacidadeCarga < 0) {
            this.capacidadeCarga = 0.0;
        } else {
            this.capacidadeCarga = capacidadeCarga;
        }
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " | Carga Máx: " + capacidadeCarga + " t";
    }
}