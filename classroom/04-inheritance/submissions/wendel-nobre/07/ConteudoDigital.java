public abstract class ConteudoDigital {
    private String titulo;
    private double precoBase;

    public ConteudoDigital(String titulo, double precoBase) {
        if (titulo == null || titulo.trim().isEmpty()) {
            this.titulo = "Conteúdo sem título";
        } else {
            this.titulo = titulo;
        }

        if (precoBase < 0) {
            this.precoBase = 0.0;
        } else {
            this.precoBase = precoBase;
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public abstract double calcularPrecoFinal();
}