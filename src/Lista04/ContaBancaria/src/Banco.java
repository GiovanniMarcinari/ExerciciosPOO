public class Banco {
    public Pessoa cadastrarPessoa() {
        System.out.println();
        System.out.println("1 - Pessoa Física");
        System.out.println("2 - Pessoa Jurídica");
        System.out.println();

        String mensagem;
        String aviso;

        mensagem = "Digite o tipo de pessoa: ";
        aviso = "Número informado inválido";
        Integer tipoPessoaInformado = Leitor.lerInteiro(1, 2, mensagem, aviso);

        mensagem = "Digite o nome da pessoa: ";
        String nome = Leitor.lerTexto(mensagem);

        mensagem = "Digite o e-mail da pessoa: ";
        String email = Leitor.lerTexto(mensagem);

        Pessoa pessoa;

        if (tipoPessoaInformado == 1) {
            mensagem = "Digite o cpf da pessoa: ";
            String cpf = Leitor.lerTexto(mensagem);

            mensagem = "Digite o telefone da pessoa: ";
            String telefone = Leitor.lerTexto(mensagem);

            pessoa = new PessoaFisica(nome, email, cpf, telefone);
        } else {
            mensagem = "Digite o CNPJ da pessoa: ";
            String cnpj = Leitor.lerTexto(mensagem);

            mensagem = "Digite a razão social da pessoa: ";
            String razaoSocial = Leitor.lerTexto(mensagem);

            pessoa = new PessoaJuridica(nome, email, cnpj, razaoSocial);
        }

        return pessoa;
    }

    public Conta criarConta(Pessoa pessoa) {
        System.out.println();
        System.out.println("1 - Conta Corrente");
        System.out.println("2 - Conta Poupança");
        System.out.println();

        String mensagem;
        String aviso;

        mensagem = "Digite o tipo de conta: ";
        aviso = "Número informado inválido";
        Integer tipoContaInformada = Leitor.lerInteiro(1, 2, mensagem, aviso);

        mensagem = "Digite o valor de depósito: ";
        aviso = "Valor de depósito inválido";
        Double depositoInicial = Leitor.lerDecimal(0.01,  10000.0, mensagem, aviso);

        Conta conta;

        if (tipoContaInformada == 1) {
            conta = new ContaCorrente(pessoa);
        } else {
            conta = new ContaPoupanca(pessoa);
        }

        conta.depositar(depositoInicial);
        return conta;
    }

}