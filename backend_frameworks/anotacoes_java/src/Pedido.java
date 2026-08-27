public class Pedido {
    private int codigo;
    private String nome_cliente;
    private double valor;

    public Pedido(int codigo, String nome_cliente, double valor){
        this.codigo = codigo;
        this.nome_cliente = nome_cliente;
        this.valor = valor;
    }

    public Pedido(int codigo, String nome_cliente){
        this(codigo, nome_cliente, 0);
        this.codigo = codigo;
        this.nome_cliente = nome_cliente;
        this.valor = 0;
    }

    @Override
    public String toString() {
        return "Pedido{" +"codigo=" + codigo +", nome_cliente='" + nome_cliente + '\'' +", valor=" + valor +'}';
    }
}
