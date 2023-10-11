import java.util.Scanner;

public class CalculadoraFatorial {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Calcular o fatorial de: ");
            int numero = scanner.nextInt();

            long resultado = calcularFatorial(numero);

            System.out.println("Resultado: O fatorial de " + numero + " é " + resultado + ".");
        }
    }

    public static long calcularFatorial(int numero) {
        if (numero < 0) {
            return -1; // Retorna -1 para indicar um erro
        } else if (numero == 0 || numero == 1) {
            return 1; // Caso base: fatorial de 0 ou 1 é 1
        } else {
            long fatorial = 1;
            for (int i = 2; i <= numero; i++) {
                fatorial *= i;
            }
            return fatorial;
        }
    }
}

