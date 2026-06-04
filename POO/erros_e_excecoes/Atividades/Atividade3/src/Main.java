import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        System.out.print("Digite o valor do saque: ");
        double valorSaque = scanner.nextDouble();

        try {
            sacar(saldo, valorSaque);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        scanner.close();
    }

    public static void sacar(double saldo, double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de saque deve ser maior que zero.");
        }
        if (valor > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente para realizar o saque!");
        }
        saldo -= valor;

        System.out.println("Saque realizado com sucesso.\nSaldo atualizado: R$1" + saldo);
    }
}
