public class CalculadoraFinanceira{
    private int c; 
    private int i;
    private int n;
    private int C;

    public CalculadoraFinanceira(int c, int i, int n, int C){
        this.c = c;
        this.i = i;
        this.n = n;
        this.C = c;
    }
    
    @Deprecated
    double calcularMontanteSimples(int c, int i, int n){
            return c * (1+i*n);
        }

    double calcularMontanteComposto(int c, int i, int n, int C){ 
        return C * (1 + i) ^n;
    }
}