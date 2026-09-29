public class Pedido {
    private String numero;
    private double valorTotal;
    private Endereco enderecoEntrega;

    public Pedido(String numero, double valorTotal, String logradouro, String cidade, String cep) {
        if (numero == null || numero.trim().isEmpty()) {
            this.numero = "Pedido sem número";
        } else {
            this.numero = numero;
        }

        if (valorTotal < 0) {
            this.valorTotal = 0.0;
        } else {
            this.valorTotal = valorTotal;
        }

        this.enderecoEntrega = new Endereco(logradouro, cidade, cep);
    }

    public String getNumero() {
        return numero;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public String getEnderecoEntregaFormatado() {
        return enderecoEntrega.getEnderecoFormatado();
    }
}