package DevDojoJavaJiraya.HHeranca.copia.dominio;

public class Funcionario extends Pessoa {

    private double salario;

    static {
        System.out.println("Bloco de inicialização estático funcionário");
    }
    {
        System.out.println("Bloco de inicialização funcionário 1");
    }
    {
        System.out.println("Bloco de inicialização funcionário 2");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor funcionário");
        // super tem que ser a primeira linha de um método construtor filho
    }

    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioPagamento() {
        System.out.println("Eu " + this.nome + "recebi o salário de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
