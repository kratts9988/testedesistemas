import java.util.Scanner;

public class SimuladorBanco {
    private static double saldo = 0;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Saldo inicial: R$ ");
            saldo = scanner.nextDouble();

            System.out.print("Depósito: R$ ");
            double deposito = scanner.nextDouble();
            realizarDeposito(deposito);

            System.out.print("Saque: R$ ");
            double saque = scanner.nextDouble();
            realizarSaque(saque);
        }

        System.out.println("Resultado: Saldo atual: R$ " + getSaldo());
    }

    public static void realizarDeposito(double valor) {
        saldo += valor;
    }

    public static void realizarSaque(double valor) {
        if (valor > saldo) {
            System.out.println("Resultado: Saldo insuficiente para realizar o saque.");
        } else {
            saldo -= valor;
        }
    }

    public static double getSaldo() {
        return saldo;
    }
}
