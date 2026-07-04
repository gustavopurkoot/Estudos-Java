public class Consulta {
    private Medico medico;
    private Paciente paciente;
    private String dataConsulta;

    public Consulta(Medico medico, Paciente paciente, String dataConsulta) {
        this.medico = medico;
        this.paciente = paciente;
        this.dataConsulta = dataConsulta;
    }

    public String toString() {
        return "Consulta em: " + dataConsulta + "\n" +
                "Dr(a): " + medico.getNome() + " - " + medico.getEspecialidade() + "(CRM: " + medico.getCrm() + ")\n" +
                "Paciente: " + paciente.getNome() + " - Enfermidade: " + paciente.getEnfermidade();
    }

}
