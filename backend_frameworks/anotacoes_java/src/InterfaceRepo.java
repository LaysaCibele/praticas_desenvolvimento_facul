public interface InterfaceRepo<T> {
    void salvar(T entidade);
    T buscarPorId(int id);
}

public class Usuario2 {
    private int id;
    private String nome;

    public Usuario2(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    public int getId() { return id; }
    public String getNome() { return nome; }
}

