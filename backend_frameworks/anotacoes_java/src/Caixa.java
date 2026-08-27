import java.util.*;

public class Caixa<T> {

    private T conteudo;

    public void set(T conteudo) {
        this.conteudo = conteudo;
    }

    public T get() {
        return conteudo;
    }

    public boolean vazio() {
        return conteudo == null;
    }
}


class TestaCaixa {

    public static void main(String[] args) {

        Caixa<Integer> guardarCaixa = new Caixa<Integer>();
        Caixa<Integer> retirarCaixa = new Caixa<Integer>();

        System.out.println("Guardar está vazia? " + guardarCaixa.vazio());

        guardarCaixa.set(10);

        System.out.println("Guardar está vazia? " + guardarCaixa.vazio());

        retirarCaixa.set(guardarCaixa.get());

        System.out.println("Valor retirado: " + retirarCaixa.get());
        System.out.println("Retirar está vazia? " + retirarCaixa.vazio());
    }
}


