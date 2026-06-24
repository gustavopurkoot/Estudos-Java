public class atividade3 {
    public static void main(String[] args) {
        int anterior = 1, atual = 1;

        for (int i = 1; i <= 10; i++) {
            System.out.print(anterior + " ");
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;

        }

    }

}
