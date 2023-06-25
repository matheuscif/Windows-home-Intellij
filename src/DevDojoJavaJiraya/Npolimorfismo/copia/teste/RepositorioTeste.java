package DevDojoJavaJiraya.Npolimorfismo.copia.teste;

import DevDojoJavaJiraya.Npolimorfismo.copia.repositorio.Repositorio;
import DevDojoJavaJiraya.Npolimorfismo.copia.servico.RepositorioMemoria;

import java.util.LinkedList;
import java.util.List;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioMemoria();
        repositorio.salvar();

        List<String> list = new LinkedList<>();
        list.add("Naruto");
        list.add("Tommy");
        list.add("Megan");
        System.out.println(list);
    }

}
