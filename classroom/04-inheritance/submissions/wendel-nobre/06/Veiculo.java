public class Veiculo {
    private String placa;
    private Motor motor; 
    public Veiculo(String placa, String combustivel, double potencia) {
        if (placa == null || placa.trim().isEmpty()) {
            this.placa = "AAA-0000";
        } else {
            this.placa = placa;
        }

        this.motor = new Motor(combustivel, potencia);
    }

    public String getPlaca() {
        return placa;
    }

    public Motor getMotor() {
        return motor;
    }

    public String getDescricao() {
        return "Veículo Placa: " + placa + " | " + motor.getDescricao();
    }
}