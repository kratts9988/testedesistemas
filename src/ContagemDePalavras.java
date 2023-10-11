import java.util.Scanner;

public class ContagemDePalavras {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite uma frase: ");
            String frase = scanner.nextLine();

            int numeroPalavras = contarPalavras(frase);

            if (numeroPalavras > 0) {
                System.out.println("Resultado: A frase possui " + numeroPalavras + " palavras.");
            } else {
                System.out.println("Resultado: A frase não possui palavras.");
            }
        }
    }

    public static int contarPalavras(String frase) {
        String[] palavras = frase.trim().split("\\s+");
        return palavras.length;
    }
}
