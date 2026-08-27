public class TestaEntidadePersistente {

    public static void main(String[] args) {
        Cliente cliente = new Cliente(1L, "Maria Silva");
        Produto produto = new Produto();

        System.out.println("--- Testando Classe Cliente ---");
        verificaEntidade(cliente);

        System.out.println("\n--- Testando Classe Produto ---");
        verificaEntidade(produto);
    }

   
 // Método que inspeciona o objeto recebido via Reflection
    // para testar se a classe possui a anotação @EntidadePersistente.
    public static void verificaEntidade(Object obj) {
        // Obtém o objeto Class que representa a classe do objeto recebido
        Class<?> classe = obj.getClass();

        if (classe.isAnnotationPresent(EntidadePersistente.class)) {
            System.out.printf("A classe '%s' É uma entidade persistente!%n", classe.getSimpleName());
        } 
        else {
            System.out.printf("A classe '%s' NÃO é uma entidade persistente.%n", classe.getSimpleName());
        }
    }   
}
