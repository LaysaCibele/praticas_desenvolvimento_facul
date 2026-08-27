public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Sistema de vendas");

        Pedido pedido1 = new Pedido(22, "Laysa");
        Pedido pedido2 = new Pedido(12, "Ana");

        System.out.println(pedido1);
        System.out.println(pedido2);
    }
}
