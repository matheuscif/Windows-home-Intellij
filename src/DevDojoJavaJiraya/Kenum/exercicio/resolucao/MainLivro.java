package DevDojoJavaJiraya.Kenum.exercicio.resolucao;

public class MainLivro {
    public static void main(String[] args) {
        Livro livro = new Livro("Senhor dos Anéis", "Tolkien", CategoriaLivros.FANTASIA);
        livro.mostrarInformacoes();
    }
}
