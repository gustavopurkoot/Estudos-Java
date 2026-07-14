# ☕ Java — Estudos e Prática

Repositório dedicado aos meus estudos em **Java**, contendo exercícios, exemplos e pequenos projetos desenvolvidos ao longo da faculdade e prática pessoal.

---

## 📚 Conteúdos Abordados

| Tema | Descrição |
|------|-----------|
| Estruturas Sequenciais | Entrada/saída, operações básicas |
| Estruturas Condicionais | `if/else`, `switch` |
| Estruturas de Repetição | `for`, `while`, `do-while` |
| Métodos | Definição, parâmetros, retorno |
| Vetores | Arrays unidimensionais |
| ArrayList | Listas dinâmicas com `java.util.ArrayList` |
| POO — Conceitos Básicos | Classes, objetos, atributos e métodos |
| POO — Encapsulamento | `private`, `getters` e `setters` |
| POO — Herança | `extends`, sobrescrita de métodos (`@Override`) |
| POO — Associação entre Classes | Relacionamentos entre objetos |
| POO — Enumerações | `enum`, constantes tipadas |
| POO — Composição | Relação "tem-um" entre classes |
| POO — Classes, Objetos e ArrayList | Combinação de POO com listas |
| Datas e Horas | `LocalDate`, `LocalTime`, `ZonedDateTime`, `Period`, `Duration` |
| Erros e Exceções | `try/catch/finally`, `throw`, `IllegalArgumentException`, `ArrayIndexOutOfBoundsException` |

---

## 📁 Estrutura do Repositório

```
📦 Java
 ┣ 📂 Classes
 ┣ 📂 estruturas_sequenciais
 ┣ 📂 estruturas_condicionais
 ┣ 📂 estruturas_de_repeticao
 ┣ 📂 metodos
 │   ┣ 📂 atividades
 │   └ 📂 extra
 ┣ 📂 vetor
 ┣ 📂 arraylist
 ┗ 📂 POO
     ┣ 📂 conceitos_basicos_de_POO
     │   ┣ 📂 atividade1  → Biblioteca com livros
     │   ┣ 📂 atividade2  → Conta bancária
     │   └ 📂 atividade3  → Carro
     ┣ 📂 encapsulamento
     │   ┣ 📂 Main        → Classe Pessoa com getters/setters
     │   └ 📂 Atividades  → Produto, Livro, ContaBancaria, Carro
     ┣ 📂 Heranca
     │   ┣ 📂 Main        → Pessoa, Aluno, Professor
     │   └ 📂 Atividade   → ItemBiblioteca, Livro, DVD
     ┣ 📂 Associacao_entre_classes
     │   ┣ 📂 Main        → Cliente e Pedido
     │   └ 📂 Atividades
     │       ┣ 📂 Biblioteca  → Cliente, Livro, Empréstimo
     │       └ 📂 Clinica     → Pessoa, Medico, Paciente, Consulta
     ┣ 📂 Enumeracoes_Composicao
     │   ┣ 📂 Enumeracao
     │   └ 📂 Composicao
     ┣ 📂 Classes_Objetos_ArrayList
     │   ┣ 📂 Main        → Pessoa com ArrayList
     │   └ 📂 Atividade   → Produto com ArrayList
     ┣ 📂 Datas_e_horas_em_java
     │   ┣ 📂 Exemplo     → LocalDate, LocalTime, ZonedDateTime, Period, Duration
     │   └ 📂 Atividades
     │     ┣ 📂 Atividade1  → Sistema de estacionamento
     │     └ 📂 Atividade2  → Cálculo de horas trabalhadas
     └ 📂 erros_e_excecoes
        ┣ 📂 Exemplo     → Validação de idade com throw
        └ 📂 Atividades
           ┣ 📂 Atividade1  → Consulta em vetor com ArrayIndexOutOfBoundsException
           ┣ 📂 Atividade2  → Validação de nota com IllegalArgumentException
           └ 📂 Atividade3  →  Simulação de saque bancário com IllegalArgumentException
```

---

## 🧠 Destaques por Tema

### 🔁 Estruturas de Repetição
Exercícios abordando `for`, `while` e `do-while`, incluindo uma simulação de sistema bancário (`Banco.java`).

### 🧩 POO — Encapsulamento
Implementação de classes com atributos privados e acesso controlado via métodos públicos. Exemplos incluem validações como `if (idade >= 0 && idade <= 150)`.

### 🧬 POO — Herança
Hierarquia de classes como `Pessoa → Aluno / Professor` e `ItemBiblioteca → Livro / DVD`, com uso de `@Override` para sobrescrever `toString()`.

### 🔗 POO — Associação entre Classes
Modelagem de relacionamentos reais: sistemas de biblioteca (Cliente, Livro, Empréstimo) e clínica médica (Medico, Paciente, Consulta).

### 📅 Datas e Horas
Uso completo da API `java.time`: `LocalDate`, `LocalTime`, `ZonedDateTime`, `Period`, `Duration`, `ChronoUnit` e `DateTimeFormatter`, incluindo leitura de datas via `Scanner`.

### ⚠️ Erros e Exceções
Tratamento de erros com `try/catch/finally` e lançamento manual de exceções com `throw`. Exemplos incluem validação de dados de entrada e acesso seguro a vetores.

---

## 🚀 Objetivo

- Praticar lógica de programação com Java
- Aprender e aplicar os pilares da Programação Orientada a Objetos
- Servir como base de estudos para projetos mais avançados no futuro

---

## 🛠️ Tecnologias

- **Java** (versão recomendada: 17+)
- **VS Code** com extensão [Java Extension Pack](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)

---

## ▶️ Como Executar

1. Clone o repositório:

```bash
git clone https://github.com/gustavopurkoot/Estudos-Java.git
```

2. Abra o projeto no VS Code

3. Navegue até a pasta do projeto desejado e execute com o botão ▶️ ou pelo terminal:

```bash
cd caminho/do/projeto
javac src/*.java -d bin
java -cp bin Main
```

---

## 📌 Observações

- Os códigos são voltados para aprendizado, podendo conter versões diferentes de um mesmo exercício
- A organização por pastas segue os temas estudados em aula
- Cada subpasta tem seu próprio `README.md` com detalhes do exercício

---

## 👨‍💻 Autor

**Gustavo Purkoot** — Estudante de TI

---

## ⭐ Contribuições

Este é um repositório de estudos pessoais, mas sugestões e feedbacks são sempre bem-vindos!