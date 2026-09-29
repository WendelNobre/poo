import java.util.Scanner;

public class PassosElefante {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a posiçao da casa do amigo: ");
        int x = scanner.nextInt();

        if (x >= 1 && x <= 1000000) {
            int passos = calcularPassosMinimos(x);
            String saida = formatarSaida(passos);
            System.out.println(saida);
        }

        scanner.close();
    }

    public static int calcularPassosMinimos(int x) {
        if (x % 5 == 0) {
            return x / 5;
        } else {
            return (x / 5) + 1;
        }
    }

    public static String formatarSaida(int passos) {
        return "O número mínimo de passos necessários é: " + passos;
    }
}