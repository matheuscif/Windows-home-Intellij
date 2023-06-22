package DevDojoJavaJiraya.LclasseAbstrata.copia.dominio;

public abstract class Funcionario extends Pessoa {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public abstract void calculaBonus();
    // ao criar um método abstrato todos os filhos deverão ter este método de modo concreto

    @Override
    public void imprime() {
        System.out.println("Imprimindo...");
    }
    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
