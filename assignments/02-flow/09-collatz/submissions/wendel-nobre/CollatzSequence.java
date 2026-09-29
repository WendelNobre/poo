import java.util.Scanner;

public class CollatzSequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero inteiro positivo: ");
        int n = scanner.nextInt();

        if (n < 1) {
            System.out.println("Erro: O numero deve ser um inteiro positivo.");
        } else {
            System.out.print("Sequencia de Collatz: ");
            imprimirSequencia(n);

            long soma = calculateCollatzSum(n);
            System.out.println("Soma dos termos: " + soma);
        }

        scanner.close();
    }

    public static int nextCollatz(int n) {
        if (n % 2 == 0) {
            return n / 2;
        } else {
            return (n * 3) + 1;
        }
    }

    public static long calculateCollatzSum(int n) {
        long soma = n;
        int atual = n;

        while (atual != 1) {
            atual = nextCollatz(atual);
            soma = soma + atual;
        }

        return soma;
    }

    private static void imprimirSequencia(int n) {
        int atual = n;
        System.out.print(atual);

        while (atual != 1) {
            atual = nextCollatz(atual);
            System.out.print(" → " + atual);
        }
        System.out.println();
    }
}