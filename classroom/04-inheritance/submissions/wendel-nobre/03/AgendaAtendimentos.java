public class AgendaAtendimentos {

    public Agendamento agendar(String nomeCliente) {
        return new Agendamento(nomeCliente);
    }

    public Agendamento agendar(String nomeCliente, int duracaoMinutos) {
        return new Agendamento(nomeCliente, duracaoMinutos);
    }

    public Agendamento agendar(String nomeCliente, int duracaoMinutos, boolean prioridade) {
        return new Agendamento(nomeCliente, duracaoMinutos, prioridade);
    }
}