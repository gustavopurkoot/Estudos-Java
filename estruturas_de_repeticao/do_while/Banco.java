package estruturas_de_repeticao.do_while;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float saldo_inicial = 0, operacao = 1, creditos = 0, debitos = 0;

        System.out.println("Digite o saldo inicial: ");
        saldo_inicial = scanner.nextFloat();

        do {
            System.out.println("Operacao: ");
            operacao = scanner.nextFloat();

            if (operacao > 0) {
                creditos += operacao;
            } else if (operacao < 0) {
                debitos += operacao * -1;
            }

        } while (operacao != 0);

        float cpmf = debitos * 0.004f;
        float saldo_final = saldo_inicial + creditos - debitos - cpmf;

        System.out.println("----------------------------");
        System.out.printf("Creditos........ R$ %.2f\n", creditos);
        System.out.printf("Debitos......... R$ %.2f\n", debitos);
        System.out.printf("C.P.M.F......... R$ %.2f\n", cpmf);
        System.out.printf("Saldo Final..... R$ %.2f\n", saldo_final);

        scanner.close();
    }
}