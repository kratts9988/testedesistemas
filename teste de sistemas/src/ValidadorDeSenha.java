import java.util.Scanner;

public class ValidadorDeSenha {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite a senha: ");
            String senha = scanner.nextLine();

            boolean senhaValida = validarSenha(senha);

            if (senhaValida) {
                System.out.println("Resultado: A senha é válida.");
            } else {
                System.out.println("Resultado: A senha é inválida.");
            }
        }
    }

    public static boolean validarSenha(String senha) {
        if (senha.length() < 8) {
            return false;
        }

        boolean possuiMaiuscula = false;
        boolean possuiMinuscula = false;
        boolean possuiNumero = false;

        for (char caractere : senha.toCharArray()) {
            if (Character.isUpperCase(caractere)) {
                possuiMaiuscula = true;
            } else if (Character.isLowerCase(caractere)) {
                possuiMinuscula = true;
            } else if (Character.isDigit(caractere)) {
                possuiNumero = true;
            }
        }

        return possuiMaiuscula && possuiMinuscula && possuiNumero;
    }
}
