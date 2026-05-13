import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.Duration;

public class Atividade2 {

    public static void HorasTrabalhadas(String nome, String entrada, String saida, long horas, long minutos,
            boolean horasExtras) {
        System.out.println("Nome: " + nome);
        System.out.println("Entrada: " + entrada);
        System.out.println("Saída: " + saida);
        System.out.println("Horas trabalhadas: " + horas + " horas e " + minutos + " minutos");
        System.out.println("Horas extras: " + (horasExtras ? "Sim" : "Não"));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o horário de entrada (HH:mm): ");
        String entradaTexto = scanner.nextLine();

        System.out.print("Digite o horário de saída (HH:mm): ");
        String saidaTexto = scanner.nextLine();

        LocalTime entrada = LocalTime.parse(entradaTexto, formato);
        LocalTime saida = LocalTime.parse(saidaTexto, formato);

        Duration diferenca = Duration.between(entrada, saida);
        long horasTrabalhadas = diferenca.toHours();
        long minutosTrabalhados = diferenca.toMinutes() % 60;
        boolean horasExtras = horasTrabalhadas > 8 || (horasTrabalhadas == 8 && minutosTrabalhados > 0);

        HorasTrabalhadas(nome, entradaTexto, saidaTexto, horasTrabalhadas, minutosTrabalhados, horasExtras);

        scanner.close();
    }
}