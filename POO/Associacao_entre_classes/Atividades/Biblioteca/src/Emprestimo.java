public class Emprestimo {
    private Cliente cliente;
    private Livro livro;
    private String dataEmprestimo;

    public Emprestimo(Cliente cliente, Livro livro, String dataEmprestimo) {
        this.cliente = cliente;
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
    }

    @Override
    public String toString() {
        return "\n ---\n\n" + "Dados do Empréstimo:\nCliente: " + cliente.getNome() + " (Idade: " + cliente.getIdade()
                + ")\nLivro: " + livro.getTitulo() + " por " + livro.getAutor() + "\nData de Empréstimo: "
                + dataEmprestimo;
    }

}
