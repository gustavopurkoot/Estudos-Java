import java.util.Scanner;

public class atividade2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.printf("%d x %d = %d\n", numero, i, numero * i);
        }

        scanner.close();
    }
    
}
