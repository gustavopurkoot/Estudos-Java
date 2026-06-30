class Main {
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa("Pedro", 21);

        Aluno p2 = new Aluno("Ana", 19, 12345, "Biologia");

        Professor p3 = new Professor("Jonas", 42, "Programação", 5000);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}