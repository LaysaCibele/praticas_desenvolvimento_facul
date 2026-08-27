public class Usuario {

    private int id;
    private String nome;
    private int idade;

    public Usuario(int id, String nome, int idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }



public class Aluno extends Usuario {

    private String curso;

    public Aluno(int id, String nome, int idade, String curso) {
        super(id, nome, idade);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Tipo: Aluno");
        System.out.println("Curso: " + curso);
        System.out.println("-------------------------");
    }
}
    public int getIdade() {
        return idade;
    }

    public void exibirInformacoes() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}

