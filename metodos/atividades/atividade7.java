import java.util.*;

public class atividade7 {

    public static double soma(double a, double b) {
        return a + b;
    }

    public static double subtracao(double a, double b) {
        return a - b;
    }

    public static double multiplicacao(double a, double b) {
        return a * b;
    }

    public static double divisao(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Erro: Divisão por zero não é permitida.");
            return Double.NaN;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("==== Calculadora ====");
            System.out.println("[1] Soma");
            System.out.println("[2] Subtração");
            System.out.println("[3] Multiplicação");
            System.out.println("[4] Divisão");
            System.out.println("[5] Sair");
            System.out.println();

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            if (opcao >= 1 && opcao <= 4) {
                System.out.print("Digite o primeiro número: ");
                double num1 = scanner.nextDouble();

                System.out.print("Digite o segundo número: ");
                double num2 = scanner.nextDouble();
                System.out.println();

                switch (opcao) {
                    case 1:
                        System.out.println("Resultado: " + soma(num1, num2));
                        break;
                    case 2:
                        System.out.println("Resultado: " + subtracao(num1, num2));
                        break;
                    case 3:
                        System.out.println("Resultado: " + multiplicacao(num1, num2));
                        break;
                    case 4:
                        System.out.println("Resultado: " + divisao(num1, num2));
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
            }

            System.out.println();

        } while (opcao != 5);

        System.out.println("Encerrando calculadora...");
        scanner.close();
    }
}