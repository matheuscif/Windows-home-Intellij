package DevDojoJavaJiraya.Npolimorfismo.copia.servico;

import DevDojoJavaJiraya.Npolimorfismo.copia.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em um arquivo.");
    }

}
