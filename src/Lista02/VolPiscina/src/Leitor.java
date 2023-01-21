import java.util.Scanner;

public class Leitor {
    Scanner scanner = new Scanner(System.in);

    public String lerString(String mensagem){
        System.out.print(mensagem);
        return scanner.nextLine();
    }

    public int lerInteiro(String mensagem) {
        while (true) {
            try {
                String string = lerString(mensagem);
                return Integer.parseInt(string);
            } catch (NumberFormatException e) {
                System.out.println("Digite um número válido.");
            }
        }
    }

    public double lerDecimal(String mensagem) {
        while (true) {
            try {
                String string = lerString(mensagem);
                return Double.parseDouble(string);
            } catch (NumberFormatException e) {
                System.out.println("Digite um número válido.");
            }
        }
    }
}