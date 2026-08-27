public class Professor extends Usuario {

    private String departamento;

    public Professor(int id, String nome, int idade, String departamento) {
        super(id, nome, idade);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Tipo: Professor");
        System.out.println("Departamento: " + departamento);
        System.out.println("-------------------------");
    }
}
