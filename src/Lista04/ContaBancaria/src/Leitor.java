import java.util.Scanner;

public class Leitor {
    private static Scanner entrada = new Scanner(System.in);

    public static String lerTexto(String mensagem) {
        System.out.print(mensagem);
        return entrada.nextLine();
    }

    public static Integer lerInteiro(Integer minimo, Integer maximo, String mensagem, String aviso) {
        while (true) {
            try {
                Integer valor = Integer.parseInt(lerTexto(mensagem));
                if (valor >= minimo && valor <= maximo) {
                    return valor;
                }
                System.out.println(aviso);
            } catch (NumberFormatException error) {
                System.out.println(aviso);
            }
        }
    }

    public static Double lerDecimal(Double minimo, Double maximo, String mensagem, String aviso) {
        while (true) {
            try {
                Double valor = Double.parseDouble(lerTexto(mensagem));
                if (valor >= minimo && valor <= maximo) {
                    return valor;
                }
                System.out.println(aviso);
            } catch (NumberFormatException error) {
                System.out.println(aviso);
            }
        }
    }

}