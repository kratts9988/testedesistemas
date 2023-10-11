import java.util.Scanner;


public class BuscaBinária {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
        }

        int[] lista1 = {1, 3, 5, 7, 9, 11, 13, 15};
        int busca1 = 7;
        int resultado1 = buscarNumero(lista1, busca1);

        System.out.println("Cenário 1: Número Encontrado");
        if (resultado1 >= 0) {
            System.out.println("Resultado: O número " + busca1 + " foi encontrado na posição " + resultado1 + ".");
        } else {
            System.out.println("Resultado: O número " + busca1 + " não foi encontrado na lista.");
        }

        int[] lista2 = {2, 4, 6, 8, 10};
        int busca2 = 3;
        int resultado2 = buscarNumero(lista2, busca2);

        System.out.println("\nCenário 2: Número Não Encontrado");
        if (resultado2 >= 0) {
            System.out.println("Resultado: O número " + busca2 + " foi encontrado na posição " + resultado2 + ".");
        } else {
            System.out.println("Resultado: O número " + busca2 + " não foi encontrado na lista.");
        }
    }

    public static int buscarNumero(int[] lista, int alvo) {
        int esquerda = 0;
        int direita = lista.length - 1;

        while (esquerda <= direita) {
            int meio = esquerda + (direita - esquerda) / 2;

            if (lista[meio] == alvo) {
                return meio;
            }

            if (lista[meio] < alvo) {
                esquerda = meio + 1;
            } else {
                direita = meio - 1;
            }
        }

        return -1;
    }
}
