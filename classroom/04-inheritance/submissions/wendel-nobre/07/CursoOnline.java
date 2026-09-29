public class CursoOnline extends ConteudoDigital {
    private int duracaoHoras;
    private double valorPorHora;

    public CursoOnline(String titulo, double precoBase, int duracaoHoras, double valorPorHora) {
        super(titulo, precoBase);
        if (duracaoHoras < 0) {
            this.duracaoHoras = 0;
        } else {
            this.duracaoHoras = duracaoHoras;
        }

        if (valorPorHora < 0) {
            this.valorPorHora = 0.0;
        } else {
            this.valorPorHora = valorPorHora;
        }
    }

    public int getDuracaoHoras() {
        return duracaoHoras;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    @Override
    public double calcularPrecoFinal() {
        return getPrecoBase() + (duracaoHoras * valorPorHora);
    }
}