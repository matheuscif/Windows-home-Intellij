package DevDojoJavaJiraya.LclasseAbstrata.exercicio;

public enum Naipe {
    PAUS(4,"paus"),
    COPAS(3, "copas"),
    ESPADA(2, "espada"),
    OUROS(1, "ouros");

    private int valor;
    private String nome;

    Naipe (int valor, String nome) {
        this.valor = valor;
        this.nome = nome;
    }

    public int getValor() {
        return this.valor;
    }

    public String getNome(){
        return this.nome;
    }
}
