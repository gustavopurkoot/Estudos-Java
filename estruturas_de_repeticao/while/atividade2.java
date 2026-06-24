public class atividade2 {
    public static void main(String[] args) {
        int soma = 0;
        int i = 1;

        while(i <= 100){
            soma = soma + i;
            i++;
        }

        System.out.printf("A soma dos 100 numeros e: %d", soma);
    }
}