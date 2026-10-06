public class Cliente {
    private String nome;
    private String telefone;

    public Cliente(String nome, String telefone) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome obrigatorio");
        }
        if (telefone == null || telefone.isBlank()) {
            throw new IllegalArgumentException("Telefone obrigatorio");
        }
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String toString() {
        return nome + " - " + telefone;
    }
}
