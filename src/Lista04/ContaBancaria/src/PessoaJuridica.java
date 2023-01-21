public class PessoaJuridica extends Pessoa {
    private String cnpj;
    private String razaoSocial;

    public PessoaJuridica(String nome, String email, String cnpj, String razaoSocial) {
        super(nome, email, TipoPessoa.PessoaJuridica);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    @Override
    public String toString() {
        StringBuilder mensagem = new StringBuilder();
        mensagem.append("Pessoa Juridica: \n");
        mensagem.append(String.format("Nome - %s\n", nome));
        mensagem.append(String.format("CNPJ - %s\n", cnpj));
        mensagem.append(String.format("E-mail - %s\n", email));
        mensagem.append(String.format("Razão Social - %s\n", razaoSocial));

        return mensagem.toString();
    }

}