import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.Duration;

public class Atividade1 {

    public static void Recibo(String placa, String entrada, String saida, long totalMinutos, double total) {
        System.out.println("------------------------------");
        System.out.println("Recibo");
        System.out.println("------------------------------");
        System.out.println("Placa: " + placa);
        System.out.println("Entrada: " + entrada);
        System.out.println("Saída: " + saida);
        System.out.println("Tempo total (em minutos): " + totalMinutos);
        System.out.printf("Total a pagar: R$ %.2f%n", total);
        System.out.println("------------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");

        System.out.print("Digite a placa do veículo: ");
        String placa = scanner.nextLine();

        System.out.print("Digite o horário de entrada (HH:mm): ");
        String entradaTexto = scanner.nextLine();

        System.out.print("Digite o horário de saída (HH:mm): ");
        String saidaTexto = scanner.nextLine();

        LocalTime entrada = LocalTime.parse(entradaTexto, formato);
        LocalTime saida = LocalTime.parse(saidaTexto, formato);

        Duration diferenca = Duration.between(entrada, saida);
        long totalMinutos = diferenca.toMinutes();

        double total = 5.00;
        if (totalMinutos > 60) {
            long minutosExtras = totalMinutos - 60;
            long fracoes = (minutosExtras + 14) / 15;
            total += fracoes * 2.00;
        }

        Recibo(placa, entradaTexto, saidaTexto, totalMinutos, total);

        scanner.close();
    }
}