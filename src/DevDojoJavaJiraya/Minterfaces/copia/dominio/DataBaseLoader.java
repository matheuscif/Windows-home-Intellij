package DevDojoJavaJiraya.Minterfaces.copia.dominio;

public class DataBaseLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void checkPermission() {
        DataLoader.super.checkPermission();
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco de dados!");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na classe DatabaseLoader");
    }
}
