import java.util.Scanner;

public class atividade6 {

    public static void tabuada(int numero) {
        for (int i = 1; i <=10 ; i++){ 
            System.out.printf("%d x %d = %d\n", numero, i, numero * i);
        }
    }
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        tabuada(numero);

        scanner.close();
        
    }
}
