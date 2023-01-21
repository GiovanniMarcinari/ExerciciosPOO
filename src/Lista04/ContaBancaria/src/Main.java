public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Pessoa pessoa = banco.cadastrarPessoa();
        Conta conta = banco.criarConta(pessoa);

        System.out.println();
        System.out.println(conta);
    }

}