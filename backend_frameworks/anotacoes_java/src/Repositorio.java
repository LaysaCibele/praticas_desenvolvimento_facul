class Repositorio<T> {
    // T: Tipo
    private T t;

    public void set(T t) { 
	this.t = t; 
    }
    public T get() { 
	return t; 
   }
}

class TestaRepositorio  {

public static void main(String[] args) {
         Repositorio<Integer> integerRep = new Repositorio<Integer>();
         Repositorio<String> stringRep = new Repositorio <String>();

         integerRep.set(new Integer(34));
         stringRep.set(new String("Testando"));

         System.out.printf("Integer Value :%d\n\n", integerRep.get());
         System.out.printf("String Value :%s\n", stringRep.get());
      }

}
