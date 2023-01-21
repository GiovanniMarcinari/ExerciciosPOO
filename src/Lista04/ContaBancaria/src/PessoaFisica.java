public class PessoaFisica extends Pessoa {
    private String cpf;
    private String telefone;

    public PessoaFisica(String nome, String email, String cpf, String telefone) {
        super(nome, email, TipoPessoa.PessoaFisica);
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        StringBuilder mensagem = new StringBuilder();
        mensagem.append("Pessoa: \n");
        mensagem.append(String.format("Nome - %s\n", nome));
        mensagem.append(String.format("CPF - %s\n", cpf));
        mensagem.append(String.format("E-mail - %s\n", email));
        mensagem.append(String.format("Telefone - %s\n", telefone));

        return mensagem.toString();
    }

}