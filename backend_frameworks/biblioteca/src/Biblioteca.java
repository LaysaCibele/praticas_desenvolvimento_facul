import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Livro> livros;
    private ArrayList<Usuario> usuarios;

    public Biblioteca() {
        livros = new ArrayList<>();
        usuarios = new ArrayList<>();
    }

    public void cadastrarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro cadastrado com sucesso!");
    }

    public void listarLivros() {

        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
            return;
        }

        System.out.println("\n===== LIVROS =====");

        for (Livro livro : livros) {
            livro.exibirInformacoes();
        }
    }

    public void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuário cadastrado com sucesso!");
    }

    public void listarUsuarios() {

        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado.");
            return;
        }

        System.out.println("\n===== USUÁRIOS =====");

        for (Usuario usuario : usuarios) {
            usuario.exibirInformacoes();
        }
    }

    public Livro buscarLivro(String titulo) {

        for (Livro livro : livros) {

            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }

        return null;
    }

    public Usuario buscarUsuario(int id) {

        for (Usuario usuario : usuarios) {

            if (usuario.getId() == id) {
                return usuario;
            }
        }

        return null;
    }

    public void emprestarLivro(String titulo, int idUsuario) {

        Livro livro = buscarLivro(titulo);
        Usuario usuario = buscarUsuario(idUsuario);

        if (livro == null) {
            System.out.println("Livro não encontrado.");
            return;
        }

        if (usuario == null) {
            System.out.println("Usuário não encontrado.");
            return;
        }

        if (!livro.isDisponivel()) {
            System.out.println("Esse livro já está emprestado.");
            return;
        }

        livro.setDisponivel(false);

        System.out.println(
                "Livro emprestado para " + usuario.getNome() + "!"
        );
    }

    public void devolverLivro(String titulo) {

        Livro livro = buscarLivro(titulo);

        if (livro == null) {
            System.out.println("Livro não encontrado.");
            return;
        }

        if (livro.isDisponivel()) {
            System.out.println("Esse livro já está disponível.");
            return;
        }

        livro.setDisponivel(true);

        System.out.println("Livro devolvido com sucesso!");
    }
}