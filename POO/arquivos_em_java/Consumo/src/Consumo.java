/* Biblioteca para leitura de dados de arquivos */
import java.util.Scanner;
/* Biblioteca para usar listas dinâmicas (ArrayList) */
import java.util.ArrayList;
/* Biblioteca para representar e manipular arquivos */
import java.io.File;
 
class Usuario {
 
    String nome;
    double consumo;
 
    public Usuario(String nome, double consumo) {
        this.nome = nome;
        this.consumo = consumo;
    }
}
 
class Consumo {
    public static void main(String[] args) throws Exception {
 
        /* Lista que armazenará os contatos em memória */
        ArrayList<Usuario> lista = new ArrayList<>();
 
        /* Representa o arquivo consumo.txt */
        File arquivo = new File("consumo.txt");
 
        /* Verifica se o arquivo existe */
        if (arquivo.exists()) {
 
            /* Scanner usado para ler o arquivo */
            Scanner leitor = new Scanner(arquivo);
 
            /* Enquanto houver linhas no arquivo */
            while (leitor.hasNextLine()) {
 
                /* Lê uma linha completa */
                String linha = leitor.nextLine();
 
                /* Divide a linha usando ";" */
                String[] partes = linha.split(";");
 
                /* Guarda cada parte em variáveis */
                String nome = partes[0];
                double consumo = Double.parseDouble(partes[1]) ;
 
                /* Cria um objeto Contato e adiciona ao ArrayList */
                lista.add(new Usuario(nome, consumo));
            }
 
            /* Fecha o leitor do arquivo */
            leitor.close();
        }
 
        /* Percorre toda a lista */
        for (Usuario c : lista) {
 
            /* Mostra os dados do contato */
            System.out.println(c.nome + " - " + c.consumo);
        }

    }
}