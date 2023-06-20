package DevDojoJavaJiraya.ZEx70AssociacaoSeminario;

public class Aluno {
    private String nome;
    private int idade;
    private Seminario seminario;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void imprimir() {
        System.out.println(this.nome);
        System.out.println(this.idade);

        if (seminario != null) {
            System.out.println(seminario.getTitulo());
        }
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade(){
        return this.idade;
    }

    public void setSeminario(Seminario seminario){
        this.seminario = seminario;
    }
}
