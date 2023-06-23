package DevDojoJavaJiraya.Kenum.exercicio.resolucao;

public enum CategoriaLivros {
    FICCAO("Ficção"),
    ROMANCE("Romance"),
    FANTASIA("Fantasia"),
    SUSPENSE("Suspense");

    private String nomeCategoria;

    CategoriaLivros(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }
}
