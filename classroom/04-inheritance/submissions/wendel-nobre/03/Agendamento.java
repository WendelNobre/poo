public class Agendamento {
    private String nomeCliente;
    private int duracaoMinutos;
    private boolean prioridade;

    public Agendamento(String nomeCliente) {
        this(nomeCliente, 30, false);
    }

    public Agendamento(String nomeCliente, int duracaoMinutos) {
        this(nomeCliente, duracaoMinutos, false);
    }

    public Agendamento(String nomeCliente, int duracaoMinutos, boolean prioridade) {
        if (nomeCliente == null || nomeCliente.trim().isEmpty()) {
            this.nomeCliente = "Cliente não identificado";
        } else {
            this.nomeCliente = nomeCliente;
        }

        if (duracaoMinutos <= 0) {
            this.duracaoMinutos = 30;
        } else {
            this.duracaoMinutos = duracaoMinutos;
        }

        this.prioridade = prioridade;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public boolean isPrioridade() {
        return prioridade;
    }

    public String getResumo() {
        String textoPrioridade = prioridade ? "Sim" : "Não";
        return "Cliente: " + nomeCliente + " | Duração: " + duracaoMinutos + " min | Prioridade: " + textoPrioridade;
    }
}