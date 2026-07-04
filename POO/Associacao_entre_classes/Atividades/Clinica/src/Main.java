public class Main {
    public static void main(String[] args) throws Exception {

        // Criando médicos
        Medico medico1 = new Medico("Carlos", 45, "Cardiologia", "12345");
        Medico medico2 = new Medico("Roberto", 50, "Ortopedia", "54321");

        // Criando pacientes
        Paciente paciente1 = new Paciente("Ana", 30, "Hipertensão");
        Paciente paciente2 = new Paciente("Fernanda", 28, "Fratura no tornozelo");

        // Criando consultas
        Consulta consulta1 = new Consulta(medico1, paciente1, "17/04/2026");
        Consulta consulta2 = new Consulta(medico2, paciente2, "22/04/2026");

        // Exibindo informações das consultas
        System.out.println(consulta1);
        System.out.println("\n-----------------------------\n");
        System.out.println(consulta2);
    }
}
