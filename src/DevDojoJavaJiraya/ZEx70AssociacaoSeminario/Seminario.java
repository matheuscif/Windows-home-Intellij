package DevDojoJavaJiraya.ZEx70AssociacaoSeminario;

public class Seminario {
    private String titulo;
    private Local local;
    private Aluno[] alunos;
    private Professor professor;

    public Seminario(String titulo, Local local){
        this.titulo = titulo;
        this.local = local;
    }

    public void imprimir(){
        System.out.println(this.titulo);
        System.out.println(local.getEndereco());
        System.out.println(professor.getNome());
        if (this.alunos == null) return;
        for (Aluno aluno : alunos){
            System.out.println(aluno.getNome());
        }
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return this.titulo;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
    public Aluno[] getAlunos(){
        return this.alunos;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
