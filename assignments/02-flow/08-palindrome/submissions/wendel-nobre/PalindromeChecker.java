import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (true) {
            System.out.print("Digite uma sequência: ");
            input = scanner.nextLine();

            if (isValidInput(input)) {
                break;
            } else {
                System.out.println("Erro: A entrada não pode estar vazia.");
            }
        }

        String inputLimpa = input.trim();

        if (isPalindrome(inputLimpa)) {
            System.out.println("A sequência \"" + inputLimpa + "\" é um palíndromo.");
        } else {
            System.out.println("A sequência \"" + inputLimpa + "\" não é um palíndromo.");
        }

        scanner.close();
    }

    public static boolean isValidInput(String input) {
        if (input == null || input.trim().isEmpty()) {
            return false;
        }
        return true;
    }

    public static boolean isPalindrome(String input) {
        String texto = input.toLowerCase();
        int inicio = 0;
        int fim = texto.length() - 1;

        while (inicio < fim) {
            if (texto.charAt(inicio) != texto.charAt(fim)) {
                return false;
            }
            inicio = inicio + 1;
            fim = fim - 1;
        }

        return true;
    }
}