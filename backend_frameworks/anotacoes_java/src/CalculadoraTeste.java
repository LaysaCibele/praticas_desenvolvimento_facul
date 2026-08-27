public class CalculadoraTeste {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        CalculadoraFinanceira calc1 = new CalculadoraFinanceira(200, 2, 2, 1000);

        System.out.println(calc1.calcularMontanteComposto(1000, 5, 2, 1200));
    }
}
