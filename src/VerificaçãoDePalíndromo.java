import java.util.Scanner;

public class VerificaçãoDePalíndromo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite uma palavra: ");
            String palavra = scanner.nextLine();

            boolean ehPalindromo = verificarPalindromo(palavra);

            if (ehPalindromo) {
                System.out.println("Resultado: A palavra \"" + palavra + "\" é um palíndromo.");
            } else {
                System.out.println("Resultado: A palavra \"" + palavra + "\" não é um palíndromo.");
            }
        }
    }

    public static boolean verificarPalindromo(String palavra) {
        int comprimento = palavra.length();
        for (int i = 0; i < comprimento / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(comprimento - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
