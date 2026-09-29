public class Endereco {
    private String logradouro;
    private String cidade;
    private String cep;

    public Endereco(String logradouro, String cidade, String cep) {
        if (logradouro == null || logradouro.trim().isEmpty()) {
            this.logradouro = "Logradouro não informado";
        } else {
            this.logradouro = logradouro;
        }

        if (cidade == null || cidade.trim().isEmpty()) {
            this.cidade = "Cidade não informada";
        } else {
            this.cidade = cidade;
        }

        if (cep == null || cep.trim().isEmpty()) {
            this.cep = "00000-000";
        } else {
            this.cep = cep;
        }
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getCep() {
        return cep;
    }

    public String getEnderecoFormatado() {
        return logradouro + ", " + cidade + " - CEP: " + cep;
    }
}