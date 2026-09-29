import java.util.Scanner;

public class FortalecerSenha {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a senha: ");
        String s = scanner.next();

        String senhaFortalecida = fortalecerSenha(s);

        System.out.println("Senha fortalecida: " + senhaFortalecida);

        scanner.close();
    }

    public static String fortalecerSenha(String s) {
        String melhorSenha = "";
        int maiorTempo = -1;

        for (int i = 0; i <= s.length(); i++) {
            for (char c = 'a'; c <= 'z'; c++) {
                String novaSenha = s.substring(0, i) + c + s.substring(i);
                int tempo = calcularTempoDigitacao(novaSenha);

                if (tempo > maiorTempo) {
                    maiorTempo = tempo;
                    melhorSenha = novaSenha;
                }
            }
        }

        return melhorSenha;
    }

    public static int calcularTempoDigitacao(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int tempo = 2;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                tempo = tempo + 1;
            } else {
                tempo = tempo + 2;
            }
        }

        return tempo;
    }
}