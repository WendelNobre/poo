public class Pedido {
    private static int proximoNumero = 1;
    private int numero;
    private Cliente cliente;
    private ItemPedido[] itens;
    private int quantidadeItens;
    private double frete;

    public Pedido(Cliente cliente) {
        if (cliente == null) {
            throw new IllegalArgumentException("Cliente obrigatorio");
        }
        numero = proximoNumero;
        proximoNumero++;
        this.cliente = cliente;
        itens = new ItemPedido[10];
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        if (produto == null) {
            throw new IllegalArgumentException("Produto invalido");
        }
        if (quantidadeItens >= 10) {
            throw new IllegalStateException("O pedido ja tem 10 itens");
        }
        itens[quantidadeItens] = new ItemPedido(produto, quantidade);
        quantidadeItens++;
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < quantidadeItens; i++) {
            total = total + itens[i].getTotal();
        }
        return total;
    }

    public void colocarFrete(double frete) {
        this.frete = frete;
    }

    public double calcularTotalComFrete() {
        return calcularTotal() + frete;
    }

    public boolean contemProduto(String nome) {
        int i = 0;
        while (i < quantidadeItens) {
            if (itens[i].getProduto().getNome().equalsIgnoreCase(nome)) {
                return true;
            }
            i++;
        }
        return false;
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public ItemPedido[] getItens() {
        ItemPedido[] lista = new ItemPedido[quantidadeItens];
        for (int i = 0; i < quantidadeItens; i++) {
            lista[i] = itens[i];
        }
        return lista;
    }

    public String toString() {
        return "Pedido " + numero + " - " + cliente.getNome() + " - R$ " + String.format("%.2f", calcularTotalComFrete());
    }
}
