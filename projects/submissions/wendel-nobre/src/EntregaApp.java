import java.util.Scanner;

public class EntregaApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cliente[] clientes = new Cliente[20];
        Produto[] produtos = new Produto[20];
        Pedido[] pedidos = new Pedido[20];

        int quantidadeClientes = 0;
        int quantidadeProdutos = 3;
        int quantidadePedidos = 0;

        produtos[0] = new Produto("Arroz 5kg", 30);
        produtos[1] = new Produto("Cafe 500g", 20);
        produtos[2] = new Produto("Leite", 50);

        System.out.println("=== SISTEMA DE ENTREGAS ===");

        boolean rodando = true;
        while (rodando) {
            System.out.println("\n1 - Cadastrar cliente");
            System.out.println("2 - Ver clientes");
            System.out.println("3 - Ver produtos");
            System.out.println("4 - Criar pedido");
            System.out.println("5 - Ver pedidos");
            System.out.println("6 - Sair");
            System.out.print("Escolha: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();
            limparTela();

            switch (opcao) {
                case 1:
                    if (quantidadeClientes >= clientes.length) {
                        System.out.println("Nao cabe mais clientes");
                        break;
                    }

                    try {
                        System.out.print("Nome: ");
                        String nome = scanner.nextLine();
                        System.out.print("Telefone: ");
                        String telefone = scanner.nextLine();

                        clientes[quantidadeClientes] = new Cliente(nome, telefone);
                        quantidadeClientes++;
                        System.out.println("Cliente cadastrado!");
                    } catch (IllegalArgumentException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;

                case 2:
                    if (quantidadeClientes == 0) {
                        System.out.println("Nenhum cliente cadastrado");
                    } else {
                        for (int i = 0; i < quantidadeClientes; i++) {
                            System.out.println((i + 1) + " - " + clientes[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Produtos:");
                    for (int i = 0; i < quantidadeProdutos; i++) {
                        System.out.println((i + 1) + " - " + produtos[i]);
                    }
                    break;

                case 4:
                    if (quantidadeClientes == 0) {
                        System.out.println("Cadastre um cliente primeiro");
                        break;
                    }
                    if (quantidadePedidos >= pedidos.length) {
                        System.out.println("Nao cabe mais pedidos");
                        break;
                    }

                    System.out.println("Clientes:");
                    for (int i = 0; i < quantidadeClientes; i++) {
                        System.out.println((i + 1) + " - " + clientes[i]);
                    }

                    System.out.print("Escolha o cliente: ");
                    int numeroCliente = scanner.nextInt();

                    if (numeroCliente < 1 || numeroCliente > quantidadeClientes) {
                        System.out.println("Cliente invalido");
                        break;
                    }

                    Pedido pedido = new Pedido(clientes[numeroCliente - 1]);
                    boolean adicionando = true;

                    while (adicionando) {
                        System.out.println("\nProdutos:");
                        for (int i = 0; i < quantidadeProdutos; i++) {
                            System.out.println((i + 1) + " - " + produtos[i]);
                        }
                        System.out.println("0 - Terminar pedido");
                        System.out.print("Escolha o produto: ");
                        int numeroProduto = scanner.nextInt();

                        if (numeroProduto == 0) {
                            adicionando = false;
                        } else if (numeroProduto < 1 || numeroProduto > quantidadeProdutos) {
                            System.out.println("Produto invalido");
                        } else {
                            System.out.print("Quantidade: ");
                            int quantidade = scanner.nextInt();

                            try {
                                pedido.adicionarProduto(produtos[numeroProduto - 1], quantidade);
                                System.out.println("Produto adicionado");
                            } catch (IllegalArgumentException e) {
                                System.out.println("Erro: " + e.getMessage());
                            }
                        }
                    }

                    if (pedido.getItens().length == 0) {
                        System.out.println("Pedido vazio. Pedido nao criado");
                    } else {
                        pedidos[quantidadePedidos] = pedido;
                        quantidadePedidos++;

                        System.out.println("\nPedido criado!");
                        System.out.println(pedido);
                        for (ItemPedido item : pedido.getItens()) {
                            System.out.println(item);
                        }

                        System.out.print("Endereco: ");
                        scanner.nextLine();
                        String endereco = scanner.nextLine();

                        System.out.println("1 - Economica");
                        System.out.println("2 - Expressa");
                        System.out.print("Tipo de entrega: ");
                        int tipo = scanner.nextInt();

                        Entrega entrega;
                        if (tipo == 1) {
                            entrega = new EntregaEconomica(pedido, endereco);
                        } else {
                            entrega = new EntregaExpressa(pedido, endereco);
                        }

                        pedido.colocarFrete(entrega.calcularFrete());
                        System.out.println(entrega);
                        System.out.println("Total dos produtos: R$ " + String.format("%.2f", pedido.calcularTotal()));
                        System.out.println("Frete: R$ " + String.format("%.2f", entrega.calcularFrete()));
                        System.out.println("Total com frete: R$ " + String.format("%.2f", pedido.calcularTotalComFrete()));
                    }
                    break;

                case 5:
                    if (quantidadePedidos == 0) {
                        System.out.println("Nenhum pedido criado");
                    } else {
                        for (int i = 0; i < quantidadePedidos; i++) {
                            Pedido p = pedidos[i];
                            System.out.println("\n" + p);
                            for (ItemPedido item : p.getItens()) {
                                System.out.println(item);
                            }
                        }
                    }
                    break;

                case 6:
                    rodando = false;
                    System.out.println("Programa encerrado");
                    break;

                default:
                    System.out.println("Opcao invalida");
            }
        }

        scanner.close();
    }

    public static void limparTela() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            for (int i = 0; i < 30; i++) {
                System.out.println();
            }
        }
    }
}
