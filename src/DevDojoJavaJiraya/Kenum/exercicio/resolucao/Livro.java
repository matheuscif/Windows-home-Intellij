package DevDojoJavaJiraya.Kenum.exercicio.resolucao;

public class Livro {
    String nome;
    String autor;
    CategoriaLivros categoriaLivros;

    Livro(String nome, String autor, CategoriaLivros categoriaLivros) {
        this.nome = nome;
        this.autor = autor;
        this.categoriaLivros = categoriaLivros;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Autor: " + this.autor);
        System.out.println("Categoria: " + this.categoriaLivros.getNomeCategoria());
    }
}

