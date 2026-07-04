public class Main {
    public static void main(String[] args) throws Exception {

        Cliente c1 = new Cliente("Carlos Silva", 25);
        Livro l1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        Emprestimo e1 = new Emprestimo(c1, l1, "12/05/2026");

        System.out.println(e1);

        Cliente c2 = new Cliente("Ana Pereira", 30);
        Livro l2 = new Livro("A revolução dos bichos", "George Orwell");
        Emprestimo e2 = new Emprestimo(c2, l2, "08/04/2025");

        System.out.println(e2);

    }
}
