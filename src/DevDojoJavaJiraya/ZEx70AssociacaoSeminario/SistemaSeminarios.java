package DevDojoJavaJiraya.ZEx70AssociacaoSeminario;

public class SistemaSeminarios {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Matheus", 23);
        Aluno aluno1 = new Aluno("Ari", 25);
        Aluno aluno2 = new Aluno("Vó Pipokinha", 65);

        Local local = new Local("Av JK");
        Local local1 = new Local("Av Brasilia");

        Seminario seminario = new Seminario("Como viajar sem dinheiro!", local);
        Seminario seminario1 = new Seminario("Dance como a pipokinha!", local1);

        Professor professor = new Professor("Carlinha", "Vigarista");

        seminario.setProfessor(professor);
        seminario1.setProfessor(professor);

        aluno.setSeminario(seminario);
        aluno1.setSeminario(seminario);
        aluno2.setSeminario(seminario1);

        Aluno [] alunosSeminario = {aluno, aluno1};

        Seminario [] seminarios = {seminario, seminario1};

        professor.setSeminarios(seminarios);

        seminario.setAlunos(alunosSeminario);
        // Impressões

        aluno.imprimir();
        System.out.println();
        aluno1.imprimir();
        System.out.println();
        aluno2.imprimir();
        System.out.println();
        seminario.imprimir();
        System.out.println();
        // seminario1.imprimir();
        System.out.println();
        professor.imprimir();

    }
}
