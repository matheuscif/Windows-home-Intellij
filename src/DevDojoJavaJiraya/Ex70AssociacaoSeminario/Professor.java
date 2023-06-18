package DevDojoJavaJiraya.Ex70AssociacaoSeminario;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void imprimir(){
        System.out.println(this.nome);
        System.out.println(this.especialidade);
        for (Seminario seminarios : seminarios){
            System.out.println(seminarios.getTitulo());
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }
    public String getEspecialidade(){
        return this.especialidade;
    }

    public void setSeminarios(Seminario[] seminarios){
        this.seminarios = seminarios;
    }


}
