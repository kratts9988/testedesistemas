import java.util.ArrayList;
import java.util.Scanner;

public class SomaDosNumerosPares {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<Integer> lista = new ArrayList<Integer>();
            System.out.print("Digite os números separados por vírgula (ex: 2,4,6,8,10): ");
            String input = scanner.nextLine();

            String[] numeros = input.split(",");
            for (String numero : numeros) {
                lista.add(Integer.parseInt(numero.trim()));
            }

            int somaPares = calcularSomaPares(lista);

            if (somaPares > 0) {
                System.out.println("Resultado: A soma dos números pares é " + somaPares + ".");
            } else {
                System.out.println("Resultado: A lista não contém números pares.");
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public static int calcularSomaPares(ArrayList<Integer> lista) {
        int soma = 0;
        for (int numero : lista) {
            if (numero % 2 == 0) {
                soma += numero;
            }
        }
        return soma;
    }
}
