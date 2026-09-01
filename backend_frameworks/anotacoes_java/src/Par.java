public class Par<K, V> {
    private K chave;
    private V valor;

    public Par(K chave, V valor){
        this.chave = chave;
        this.valor = valor;
    }
    public K getChave(){
        return chave;
    }
    public V getValor(){
        return valor;
    }

    @Override
    public String toString(){
        return "(" + chave + "," + valor + ")";
    }
}


class TestePar {

    public static void main(String[] args){
        Par<String, Double> notaAluno = new Par<>("Laysa", 9.5);
        Par<String, Integer> codigoProduto = new Par<>("Livro", 1234);


        System.out.println("Par 1: " + notaAluno);
        System.out.println("Par 2: " +  codigoProduto);


        System.out.println("Chave do produto: " + codigoProduto.getChave());
        System.out.println("Valor do produto: " + codigoProduto.getValor());
    }
}