public class AgendaAtendimentosApp {
    public static void main(String[] args) {
        AgendaAtendimentos agenda = new AgendaAtendimentos();

        // 1. Agendamento apenas com o nome
        Agendamento a1 = agenda.agendar("Ana Silva");

        // 2. Agendamento com nome e duração
        Agendamento a2 = agenda.agendar("Bruno Souza", 45);

        // 3. Agendamento com nome, duração e prioridade
        Agendamento a3 = agenda.agendar("Carla Dias", 60, true);

        // Demonstração com tratamento de entrada inválida (nome vazio e duração <= 0)
        Agendamento a4 = agenda.agendar("", -10, false);

        System.out.println("--- Resumo dos Agendamentos ---");
        System.out.println(a1.getResumo());
        System.out.println(a2.getResumo());
        System.out.println(a3.getResumo());
        System.out.println(a4.getResumo());
    }
}