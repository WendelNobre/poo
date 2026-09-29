import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro não negativo: ");
        int n = scanner.nextInt();

        long fib = calcularFibonacci(n);
        String saida = formatarSaida(fib, n);

        System.out.println(saida);

        scanner.close();
    }

    public static long calcularFibonacci(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        long a = 0;
        long b = 1;
        long resultado = 0;

        for (int i = 2; i <= n; i++) {
            resultado = a + b;
            a = b;
            b = resultado;
        }

        return resultado;
    }

    public static String formatarSaida(long fib, int n) {
        return "O " + n + "º número de Fibonacci é: " + fib;
    }
}