package DevDojoJavaJiraya.Minterfaces.copia.test;

import DevDojoJavaJiraya.Minterfaces.copia.dominio.DataBaseLoader;
import DevDojoJavaJiraya.Minterfaces.copia.dominio.DataLoader;
import DevDojoJavaJiraya.Minterfaces.copia.dominio.FileLoader;

public class DataLoaderTest {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        dataBaseLoader.load();
        fileLoader.load();

        dataBaseLoader.remove();
        fileLoader.remove();

        dataBaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retrieveMaxDataSize();
        DataBaseLoader.retrieveMaxDataSize();

    }
}
