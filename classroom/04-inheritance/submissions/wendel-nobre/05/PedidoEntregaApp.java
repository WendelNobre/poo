public class PedidoEntregaApp {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido("PED-1001", 250.50, "Av. Ana Costa, 123", "Santos", "11060-001");
        Pedido pedido2 = new Pedido("PED-1002", 89.90, "", "São Paulo", "");

        System.out.println("--- " + pedido1.getNumero() + " ---");
        System.out.println("Valor Total: R$ " + pedido1.getValorTotal());
        System.out.println("Endereço: " + pedido1.getEnderecoEntregaFormatado());

        System.out.println("\n--- " + pedido2.getNumero() + " ---");
        System.out.println("Valor Total: R$ " + pedido2.getValorTotal());
        System.out.println("Endereço: " + pedido2.getEnderecoEntregaFormatado());
    }
}