import java.util.Scanner;

public class atividade3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 1, total = 0;

        while (num != 0) {
            System.out.print("Digite um numero: ");
            num = scanner.nextInt();
            total += num;
        }

        System.out.printf("o Total foi de: %d", total);

        scanner.close();
    }
    
}
