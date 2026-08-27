public class Usuario implements Autenticavel {
    private String login;
    private String senha_usuario;

    public Usuario(String login, String senha_usuario) {
        this.login = login;
        this.senha_usuario = senha_usuario;
    }

    @Override
    public boolean autenticar(String senha) {
        return this.senha_usuario.equals(senha);
    }
}


