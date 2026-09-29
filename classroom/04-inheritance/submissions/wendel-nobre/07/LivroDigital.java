public class LivroDigital extends ConteudoDigital {
    private double taxaEditorial;

    public LivroDigital(String titulo, double precoBase, double taxaEditorial) {
        super(titulo, precoBase);
        if (taxaEditorial < 0) {
            this.taxaEditorial = 0.0;
        } else {
            this.taxaEditorial = taxaEditorial;
        }
    }

    public double getTaxaEditorial() {
        return taxaEditorial;
    }

    @Override
    public double calcularPrecoFinal() {
        return getPrecoBase() + taxaEditorial;
    }
}