package DevDojoJavaJiraya.Npolimorfismo.copia.servico;

import DevDojoJavaJiraya.Npolimorfismo.copia.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em memória.");
    }
}
