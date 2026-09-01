import java.util.HashMap;
import java.util.Map;

// Ao implementar Repositorio<Usuario>, definimos 'Usuario' como o tipo T da interface
public class RepositorioUsuarioInMemory implements InterfaceRepo<Usuario> {
    private Map<Integer, Usuario> bancoDados = new HashMap<>();

    @Override
    public void salvar(Usuario2 usuario) {
        bancoDados.put(usuario.getId(), usuario);
    }

    @Override
    public Usuario2 buscarPorId(int id) {
        return bancoDados.get(id);
    }
}
