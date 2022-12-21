package notasAlunos;

public class Main {
    private final static int Alunos = 3;
    private final static int Notas = 3;

    public static void main(String[] args) {
        Aluno[] alunos = new Aluno[Alunos];
        Leitor leitor = new Leitor();

        for(int i = 0; i < Alunos; i++){
            String nome = leitor.lerString("Digite o nome do aluno: ");
            double[] notas = leitor.lerVariosDecimais("Digite a nota do aluno: ", Notas);
            alunos[i] = new Aluno(nome, notas);
        }
        for(Aluno aluno : alunos) {
            System.out.printf("%s teve a média de %.2f.\n", aluno.getNome(), aluno.calcularMedia());
        }
    }
}