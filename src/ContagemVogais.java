    import java.util.Scanner;
public class ContagemVogais {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite uma frase: ");
            String frase = scanner.nextLine();

            int numeroVogais = contarVogais(frase);

            if (numeroVogais > 0) {
                System.out.println("Resultado: A frase possui " + numeroVogais + " vogais.");
            } else {
                System.out.println("Resultado: A frase não possui vogais.");
            }
        }
    }

    public static int contarVogais(String frase) {
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            char letra = Character.toLowerCase(frase.charAt(i));
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador++;
            }
        }
        return contador;
    }
}
    

