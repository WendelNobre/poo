import java.util.Scanner;

public class HeartRatesApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu primeiro nome: ");
        String firstName = scanner.next();

        System.out.print("Digite seu sobrenome: ");
        String lastName = scanner.next();

        System.out.print("Digite sua data de nascimento (dia, mes e ano separados por espaço): ");
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();

        HeartRates person = new HeartRates(firstName, lastName, day, month, year);

        int currentYear = 2024;
        int age = person.calculateAge(currentYear);
        int maxHeartRate = person.calculateMaxHeartRate();
        String targetHeartRate = person.calculateTargetHeartRate();

        System.out.println("\nNome: " + person.getFirstName() + " " + person.getLastName());
        System.out.printf("Data de nascimento: %02d/%02d/%d\n", person.getDayOfBirth(), person.getMonthOfBirth(), person.getYearOfBirth());
        System.out.println("Idade: " + age + " anos");
        System.out.println("Frequencia cardiaca máxima: " + maxHeartRate + " bpm");
        System.out.println("Faixa de frequencia cardíaca alvo: " + targetHeartRate);

        scanner.close();
    }
}