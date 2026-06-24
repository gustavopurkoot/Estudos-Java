package vetor.Atividades;

import java.util.Scanner;

public class atividade1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // int[] vetor = {10, 20, 30, 40, 50, 60, 70};
        int[][] numeros = new int[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Digite o numero para a posição [%d][%d]: ", i, j);
                numeros[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%10d", numeros[i][j]);
            }
            System.out.print("\n");
        }

        // for (int i = 0; i < vetor.length; i++) {
        // System.out.printf("O numero na posição [%d] e: %d\n", i + 1, vetor[i]);
        // for (int elemento : vetor) {
        // System.out.print(elemento + " ");
        // }

        scanner.close();
    }
}