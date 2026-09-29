public class EntregaExpressa extends Entrega {

    public EntregaExpressa(double distancia, double peso) {
        super(distancia, peso);
    }

    @Override
    public double calcularFrete() {
        return super.calcularFrete() + 20.00;
    }

    @Override
    public int calcularPrazo() {
        int prazoConvencional = super.calcularPrazo();
        int prazoExpresso = (int) Math.ceil(prazoConvencional / 2.0);
        if (prazoExpresso < 1) {
            return 1;
        }
        return prazoExpresso;
    }

    @Override
    public String getDescricao() {
        return "Entrega Expressa";
    }
}