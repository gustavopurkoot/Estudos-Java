import java.util.*;

public class atividade8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> alunos = new ArrayList<>();

        int opcao;

        while (true) {

            exibirMenu();
            opcao = scanner.nextInt();

            if (opcao == 5) {
                break;
            }

            switch (opcao) {
                case 1:
                    adicionarAluno(scanner, alunos);
                    break;
                case 2:
                    listarAlunos(alunos);
                    break;
                case 3:
                    buscarAluno(scanner, alunos);
                    break;
                case 4:
                    removerAluno(scanner, alunos);
                    break;
                default:
                    System.out.print("Opcao invalida!");
            }

            System.out.println();
        }

        scanner.close();
    }

    /* ===== MÉTODOS ===== */

    public static void exibirMenu() {
        System.out.println("===== MENU =====");
        System.out.println("[1] Adicionar aluno");
        System.out.println("[2] Listar alunos");
        System.out.println("[3] Buscar aluno");
        System.out.println("[4] Remover aluno");
        System.out.println("[5] Sair");
        System.out.print("\nEscolha uma opcao: ");
    }

    public static void adicionarAluno(Scanner scanner, ArrayList<String> alunos) {
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.next();
        alunos.add(nome);
        System.out.println("Aluno adicionado com sucesso!");
    }

    public static void listarAlunos(ArrayList<String> alunos) {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }

        Collections.sort(alunos);

        System.out.println("Alunos cadastrados:");
        for (int i = 0; i < alunos.size(); i++) {
            System.out.printf("%d - %s\n", i + 1, alunos.get(i));
        }
    }

    public static void buscarAluno(Scanner scanner, ArrayList<String> alunos) {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }

        System.out.print("Digite o nome do aluno para buscar: ");
        String nome = scanner.next();

        if (alunos.contains(nome)) {
            System.out.println("Aluno encontrado!");
        } else {
            System.out.println("Aluno nao encontrado.");
        }
    }

    public static void removerAluno(Scanner scanner, ArrayList<String> alunos) {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }

        System.out.print("Digite o nome do aluno para remover: ");
        String nome = scanner.next();

        if (alunos.remove(nome)) {
            System.out.println("Aluno removido com sucesso!");
        } else {
            System.out.println("Aluno nao encontrado.");
        }
    }
}
