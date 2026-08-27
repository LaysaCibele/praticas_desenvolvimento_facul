import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Biblioteca biblioteca = new Biblioteca();

        int opcao = 0;

        while (opcao != 7) {

            System.out.println("\n===== BIBLIOTECA =====");
            System.out.println("1 - Cadastrar livro");
            System.out.println("2 - Listar livros");
            System.out.println("3 - Cadastrar aluno");
            System.out.println("4 - Cadastrar professor");
            System.out.println("5 - Listar usuários");
            System.out.println("6 - Empréstimo/devolução");
            System.out.println("7 - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:

                    System.out.println("\n===== CADASTRAR LIVRO =====");

                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();

                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();

                    System.out.print("Ano: ");
                    int ano = scanner.nextInt();
                    scanner.nextLine();

                    Livro livro = new Livro(titulo, autor, ano);

                    biblioteca.cadastrarLivro(livro);

                    break;

                case 2:

                    biblioteca.listarLivros();

                    break;

                case 3:

                    System.out.println("\n===== CADASTRAR ALUNO =====");

                    System.out.print("ID: ");
                    int idAluno = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Nome: ");
                    String nomeAluno = scanner.nextLine();

                    System.out.print("Idade: ");
                    int idadeAluno = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Curso: ");
                    String curso = scanner.nextLine();

                    Aluno aluno = new Aluno(
                            idAluno,
                            nomeAluno,
                            idadeAluno,
                            curso
                    );

                    biblioteca.cadastrarUsuario(aluno);

                    break;

                case 4:

                    System.out.println("\n===== CADASTRAR PROFESSOR =====");

                    System.out.print("ID: ");
                    int idProfessor = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Nome: ");
                    String nomeProfessor = scanner.nextLine();

                    System.out.print("Idade: ");
                    int idadeProfessor = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Departamento: ");
                    String departamento = scanner.nextLine();

                    Professor professor = new Professor(
                            idProfessor,
                            nomeProfessor,
                            idadeProfessor,
                            departamento
                    );

                    biblioteca.cadastrarUsuario(professor);

                    break;

                case 5:

                    biblioteca.listarUsuarios();

                    break;

                case 6:

                    System.out.println("\n===== EMPRÉSTIMO/DEVOLUÇÃO =====");
                    System.out.println("1 - Emprestar livro");
                    System.out.println("2 - Devolver livro");

                    System.out.print("Escolha: ");
                    int opcaoEmprestimo = scanner.nextInt();
                    scanner.nextLine();

                    if (opcaoEmprestimo == 1) {

                        System.out.print("Título do livro: ");
                        String tituloEmprestimo = scanner.nextLine();

                        System.out.print("ID do usuário: ");
                        int idUsuario = scanner.nextInt();
                        scanner.nextLine();

                        biblioteca.emprestarLivro(
                                tituloEmprestimo,
                                idUsuario
                        );

                    } else if (opcaoEmprestimo == 2) {

                        System.out.print("Título do livro: ");
                        String tituloDevolucao = scanner.nextLine();

                        biblioteca.devolverLivro(tituloDevolucao);

                    } else {

                        System.out.println("Opção inválida.");

                    }

                    break;

                case 7:

                    System.out.println("Encerrando o sistema...");
                    break;

                default:

                    System.out.println("Opção inválida.");

            }
        }

        scanner.close();
    }
}
