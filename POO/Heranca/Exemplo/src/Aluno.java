class Aluno extends Pessoa {
    private int matricula;
    private String curso;

    public Aluno(String nome, int idade, int matricula, String curso) {
        super(nome, idade); // chama o construtor da classe base (Pessoa)
        this.matricula = matricula;
        this.curso = curso;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void cancelarMatricula() {
        System.out.println("Matricula será cancelada!");
    }

    @Override
    public String toString() {
        return super.toString() + ", Matricula: " + matricula + ", Curso: " + curso;
    }
}