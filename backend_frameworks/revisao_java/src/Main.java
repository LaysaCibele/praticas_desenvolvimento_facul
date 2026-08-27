import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Anotação personalizada
@interface Informacao {
    String descricao();
}


// Classe principal
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Lista de objetos
        List<Aluno> alunos = new ArrayList<>();

        System.out.println("===== SISTEMA DE ALUNOS =====");

        boolean executando = true;

        while (executando) {

            System.out.println("\n1 - Cadastrar aluno");
            System.out.println("2 - Listar alunos");
            System.out.println("3 - Buscar aluno");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // limpa o ENTER

            switch (opcao) {

                case 1:

                    System.out.print("\nNome: ");
                    String nome = scanner.nextLine();

                    System.out.print("Idade: ");
                    int idade = scanner.nextInt();

                    System.out.print("Nota: ");
                    double nota = scanner.nextDouble();

                    scanner.nextLine();

                    // Criando objeto
                    Aluno aluno = new Aluno(nome, idade, nota);

                    // Adicionando na lista
                    alunos.add(aluno);

                    System.out.println("\nAluno cadastrado com sucesso!");

                    break;

                case 2:

                    System.out.println("\n===== ALUNOS CADASTRADOS =====");

                    if (alunos.isEmpty()) {

                        System.out.println("Nenhum aluno cadastrado.");

                    } else {

                        // Percorrendo a lista
                        for (Aluno a : alunos) {
                            System.out.println(a);
                        }
                    }

                    break;

                case 3:

                    System.out.print("\nDigite o nome para buscar: ");
                    String busca = scanner.nextLine();

                    boolean encontrado = false;

                    for (Aluno a : alunos) {

                        if (a.getNome().equalsIgnoreCase(busca)) {

                            System.out.println("\nAluno encontrado:");
                            System.out.println(a);

                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Aluno não encontrado.");
                    }

                    break;

                case 4:

                    executando = false;
                    System.out.println("\nPrograma encerrado.");

                    break;

                default:

                    System.out.println("\nOpção inválida!");

                    break;
            }
        }

        scanner.close();
    }
}


// Segunda classe
@Informacao(descricao = "Representa um aluno do sistema")
class Aluno {

    // Atributos
    private String nome;
    private int idade;
    private double nota;

    // Construtor
    public Aluno(String nome, int idade, double nota) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }

    // Método
    public String verificarSituacao() {

        if (nota >= 7) {
            return "Aprovado";

        } else if (nota >= 5) {
            return "Recuperação";

        } else {
            return "Reprovado";
        }
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getNota() {
        return nota;
    }

    // Sobrescrevendo o toString()
    @Override
    public String toString() {

        return "Nome: " + nome +
                " | Idade: " + idade +
                " | Nota: " + nota +
                " | Situação: " + verificarSituacao();
    }
}

