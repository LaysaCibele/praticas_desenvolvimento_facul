public class Main {
    public static void main(String[] args) {
        System.out.println("LOGIN");

        Usuario user1 = new Usuario("lala", "1234");

        Usuario user2 = new Usuario("ana", "1233");


        System.out.println(user1.autenticar("1234"));
        System.out.println(user2.autenticar("12345"));
    }
    
}


//App.java com Pedido.java
//Usuario.java com Autenticavel.java
//CalculadoraFinanceira.java com CalculadoraTeste.java
//Cliente.java está com Produto.java sozinho (não fiz main)
//Repositorio está sozinha
