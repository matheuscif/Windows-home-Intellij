package DevDojoJavaJiraya.Vio.File;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        // CRIANDO FOLDER
        File fileDiretorio = new File("pasta");
        boolean isDiretorioCreated = fileDiretorio.mkdir();
        System.out.println("Pasta criada? "+isDiretorioCreated);

        // CRIANDO FILE
        File fileArquivoDiretorio = new File(fileDiretorio, "arquivo.txt");
        boolean isFileCreated = fileArquivoDiretorio.createNewFile();
        System.out.println("arquivo.txt criado? " + isFileCreated);

        // RENOMEANDO FILE
        File fileRenamed = new File(fileDiretorio, "arquivo_renomeado.txt");
        boolean isRenamed = fileArquivoDiretorio.renameTo(fileRenamed);
        System.out.println("arquivo.txt renomeado " +isRenamed);

        // RENOMEANDO FOLDER
        File diretorioRenamed = new File("pasta2");
        boolean isFolderRenamed = fileDiretorio.renameTo(diretorioRenamed);
        System.out.println("Diretorio pasta renomeado? " +isFolderRenamed);
    }
}
