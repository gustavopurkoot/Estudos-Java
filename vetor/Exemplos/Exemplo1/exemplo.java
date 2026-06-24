package vetor.Exemplos.Exemplo1;

public class exemplo {
    public static void main(String[] args) {

        int[] numeros = {10, 20, 30, 40, 50};
        int num = 20;
        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == num) {
                System.out.println("O numero " + num + " esta na posicao " + i);
                encontrado = true;
                break;
            }
        }

        if (encontrado == false) {
            System.out.println("O numero " + num + " nao foi encontrado no vetor.");
        }

    }
    
}
