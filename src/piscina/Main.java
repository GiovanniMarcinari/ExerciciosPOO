package piscina;

public class Main {
    public static void main(String[] args) {
        Leitor leitor = new Leitor();

        double largura = leitor.lerDecimal("Digite a largura da piscina: ");
        double comprimento = leitor.lerDecimal("Digite o comprimento da piscina: ");
        double profundidade = leitor.lerDecimal("Digite a profundidade da piscina: ");

        Piscina piscina = new Piscina(largura, comprimento, profundidade);
        System.out.println(piscina);
        System.out.printf("O volume da piscina é %.2f m³.", piscina.calcularVolume());
    }
}