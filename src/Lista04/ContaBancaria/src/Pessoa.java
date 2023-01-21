public abstract class Pessoa {
    protected String nome;
    protected String email;
    protected TipoPessoa tipoPessoa;

    public Pessoa(String nome, String email, TipoPessoa tipoPessoa) {
        this.nome = nome;
        this.email = email;
        this.tipoPessoa = tipoPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }

}