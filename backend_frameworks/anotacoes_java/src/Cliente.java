import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//import com.oracle.webservices.internal.api.EnvelopeStyle;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface EntidadePersistente {
    //entidade marcadora, n recebe parâmetro
}

@EntidadePersistente 
public class Cliente {
    private Long id;
    private String nome;


    public Cliente(Long id, String nome){
        this.id = id;
        this.nome = nome;
    }
}

  class Produto{
        private Long id_produto;
        private double valor;
    }
