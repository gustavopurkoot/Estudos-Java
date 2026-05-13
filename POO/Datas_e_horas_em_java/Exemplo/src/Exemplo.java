/*
1 - TRABALHANDO COM DATAS (LocalDate)

import java.time.LocalDate;

public class Exemplo1 {
    public static void main(String[] args) {

        // Obtém a data atual do sistema
        LocalDate hoje = LocalDate.now();

        // Exibe a data no formato padrão yyyy-MM-dd
        System.out.println("Hoje: " + hoje);
    }
}

2 - FORMATANDO DATAS (DateTimeFormatter)

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exemplo {
    public static void main(String[] args) {

        // Obtém a data atual
        LocalDate hoje = LocalDate.now();

        // Define o formato desejado
        DateTimeFormatter formato =
                DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Exibe a data formatada
        System.out.println("Hoje: " + hoje.format(formato));
    }
}

3 - TRABALHANDO COM HORAS (LocalTime)

import java.time.LocalTime;

public class Exemplo {
    public static void main(String[] args) {

        // Obtém o horário atual
        LocalTime agora = LocalTime.now();

        // Exibe a hora
        System.out.println("Agora: " + agora);
    }
}

4 - FORMATANDO HORAS (DateTimeFormatter)

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Exemplo {
    public static void main(String[] args) {

        // Obtém o horário atual
        LocalTime agora = LocalTime.now();

        // Define o formato HH:mm:ss
        DateTimeFormatter formato =
                DateTimeFormatter.ofPattern("HH:mm:ss");

        // Exibe a hora formatada
        System.out.println("Agora: " + agora.format(formato));
    }
}

5 - FUSO HORÁRIO (ZonedDateTime)

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Exemplo {
    public static void main(String[] args) {

        // Define o fuso horário de São Paulo
        ZoneId brasilia = ZoneId.of("America/Sao_Paulo");

        // Obtém a data e hora atual nesse fuso
        ZonedDateTime agora = ZonedDateTime.now(brasilia);

        // Define o formato HH:mm:ss
        DateTimeFormatter formato =
                DateTimeFormatter.ofPattern("HH:mm:ss");

        // Exibe a hora formatada
        System.out.println("Agora (Brasília): " +
                agora.format(formato));
    }
}

6 - DIFERENÇA ENTRE DATAS (Period)

import java.time.LocalDate;
import java.time.Period;

public class Exemplo {
    public static void main(String[] args) {

        // Datas inicial e final
        LocalDate inicio = LocalDate.of(2020, 1, 1);
        LocalDate fim = LocalDate.of(2026, 4, 24);

        // Calcula a diferença
        Period diferenca = Period.between(inicio, fim);

        // Exibe anos, meses e dias
        System.out.println(
                diferenca.getYears() + " anos, " +
                diferenca.getMonths() + " meses e " +
                diferenca.getDays() + " dias."
        );
    }
}

7 - DIFERENÇA TOTAL EM DIAS (ChronoUnit)

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Exemplo {
    public static void main(String[] args) {

        // Datas inicial e final
        LocalDate inicio = LocalDate.of(2020, 1, 1);
        LocalDate fim = LocalDate.of(2026, 4, 24);

        // Calcula o total de dias
        long dias = ChronoUnit.DAYS.between(inicio, fim);

        // Exibe o resultado
        System.out.println("Total de dias: " + dias);
    }
}

8 - DIFERENÇA ENTRE HORÁRIOS (Duration)

import java.time.LocalTime;
import java.time.Duration;

public class Exemplo {
    public static void main(String[] args) {

        // Horários inicial e final
        LocalTime inicio = LocalTime.of(8, 30);
        LocalTime fim = LocalTime.of(12, 45);

        // Calcula a duração
        Duration diferenca = Duration.between(inicio, fim);

        // Obtém horas e minutos
        long horas = diferenca.toHours();
        long minutos = diferenca.toMinutes() % 60;

        // Exibe o resultado
        System.out.println(
                "Diferença: " + horas + "h " + minutos + "min"
        );
    }
}

9 - LENDO DATAS DO TECLADO

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicita a data
        System.out.print("Digite uma data (dd/MM/yyyy): ");
        String entrada = scanner.nextLine();

        // Define o formato esperado
        DateTimeFormatter formato =
                DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Converte a String para LocalDate
        LocalDate data =
                LocalDate.parse(entrada, formato);

        // Exibe a data formatada
        System.out.println(
                "Data digitada: " + data.format(formato)
        );

        scanner.close();
    }
}
*/

// 10 - LENDO HORAS DO TECLADO

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {

        /* Cria um Scanner para leitura de entrada do usuário */
        Scanner scanner = new Scanner(System.in);

        /* Solicita a hora no formato hh:mm */
        System.out.print("Digite a hora (hh:mm): ");
        String entrada = scanner.nextLine();

        /* Define o formato esperado da hora */
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");

        /* Converte a String para um objeto LocalTime */
        LocalTime hora = LocalTime.parse(entrada, formato);

        /* Exibe a hora formatada no mesmo padrão de entrada */
        System.out.println("Hora digitada: " + hora.format(formato));
        scanner.close();
    }
}