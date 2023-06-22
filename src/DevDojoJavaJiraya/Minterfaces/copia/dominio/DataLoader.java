package DevDojoJavaJiraya.Minterfaces.copia.dominio;

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10; // todo atributo de interface é "public static final"
    public abstract void load(); // todo metodo de interface é "public abstract"

    public default void checkPermission() { // default significa que o método não é obrigatoriamente implementado
        System.out.println("Fazendo checagem de permissões");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }
}
