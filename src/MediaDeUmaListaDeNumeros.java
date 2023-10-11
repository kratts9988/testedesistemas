import java.util.ArrayList;
import java.util.Scanner;

public class MediaDeUmaListaDeNumeros {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<Integer> lista = new ArrayList<Integer>();
            System.out.print("Digite os números separados por vírgula (ex: 5,10,15,20): ");
            String input = scanner.nextLine();

            String[] numeros = input.split(",");
            for (String numero : numeros) {
                lista.add(Integer.parseInt(numero.trim()));
            }

            double media = calcularMedia(lista);

            if (!lista.isEmpty()) {
                System.out.println("Resultado: A média dos números é " + media + ".");
            } else {
                System.out.println("Resultado: A lista está vazia, não é possível calcular a média.");
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public static double calcularMedia(ArrayList<Integer> lista) {
        if (lista.isEmpty()) {
            return 0.0;
        }

        int soma = 0;
        for (int numero : lista) {
            soma += numero;
        }

        return (double) soma / lista.size();
    }
}
