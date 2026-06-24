package vetor.Atividades;
import java.util.Scanner;

public class atividade3 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[][] vetor = new int[5][5];
    int soma = 0;

    for(int i = 0; i < 5; i++){
        for (int j = 0; j < 5; j++){
            System.out.printf("Digite um valor para o elemento [%d][%d]: ", i, j);
            vetor[i][j] = scanner.nextInt();
        }
    }

    int menor = vetor[0][0];
    int maior = vetor[0][0];

    for(int i = 0; i < 5; i++){
        for (int j = 0; j < 5; j++){
            if (vetor[i][j] < menor) {
                menor = vetor[i][j];
            }
            if (vetor[i][j] > maior) {
                maior = vetor[i][j];
            }
            soma += vetor[i][j];
        }
    }
    int media = soma / 25;
    System.out.println("Menor valor: " + menor);
    System.out.println("Maior valor: " + maior);
    System.out.println("Soma de todos os elementos: " + soma);
    System.out.println("Media dos elementos: " + media);

    scanner.close();
}
}
