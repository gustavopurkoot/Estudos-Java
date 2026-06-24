public class atividade4 {
    public static void main(String[] args) {
        float resultado = 0;
        for (int i = 1, j = 100; i <=100; i++, j--) {
            resultado = resultado + (float) i / j;
            }
        
        System.out.printf("O resultado é: %.2f", resultado);
    }
}
    
