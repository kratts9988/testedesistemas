import java.util.Arrays;
public class OrdenaçãoDeLista {

    public static void main(String[] args) {
        int[] lista1 = {9, 2, 5, 1, 7, 3};
        ordenarLista(lista1);
        System.out.println("Cenário 1: Lista Desordenada");
        System.out.println("Resultado: Lista ordenada: " + Arrays.toString(lista1));

        int[] lista2 = {1, 2, 3, 4, 5};
        ordenarLista(lista2);
        System.out.println("\nCenário 2: Lista Já Ordenada");
        System.out.println("Resultado: Lista já está ordenada: " + Arrays.toString(lista2));
    }

    public static void ordenarLista(int[] lista) {
        Arrays.sort(lista);
    }
}


