class Professor extends Pessoa {
    private String especialidade;
    private double salario;

    public Professor(String nome, int idade, String especialidade, double salario) {
        super(nome, idade);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void receberAumento(double aumento) {
        this.salario += aumento;
    }

    @Override
    public String toString() {
        return super.toString() + ", Especialidade: " + especialidade + ", Salario: " +
                salario;
    }
}