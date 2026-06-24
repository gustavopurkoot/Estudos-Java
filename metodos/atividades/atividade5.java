import java.util.Scanner;

public class atividade5 {

    public static boolean par(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (par(numero)) {
            System.out.println(numero + " é um número par.");
        } else {
            System.out.println(numero + " é um número ímpar.");
        }

        scanner.close();
        
    }
    
}
