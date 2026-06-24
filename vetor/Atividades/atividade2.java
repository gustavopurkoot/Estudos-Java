package vetor.Atividades;

import java.util.Scanner;

public class atividade2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] vetor = new int[5][5];
        int total = 0;

        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor[i].length; j++) {
                System.out.printf("Digite o numero para a posição [%d][%d]: ", i, j);
                vetor[i][j] = scanner.nextInt();
            }
        }

            for (int j = 0; j < 5; j++) {
                total += vetor[2][j];
            }
        System.out.println("A soma dos elementos da linha 3 é: " + total);


        scanner.close();
    }
    
}
