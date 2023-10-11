import java.util.Scanner;

public class NMRprimo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            boolean ehPrimo = verificarPrimo(numero);

            if (ehPrimo) {
                System.out.println("Resultado: O número " + numero + " é primo.");
            } else {
                System.out.println("Resultado: O número " + numero + " não é primo.");
            }
        }
    }

    public static boolean verificarPrimo(int numero) {
        if (numero < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}

