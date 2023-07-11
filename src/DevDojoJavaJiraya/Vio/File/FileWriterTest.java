package DevDojoJavaJiraya.Vio.File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {
        File file = new File("/home/mad0c/Documents/IntellijRep/Windows-home-Intellij/src/DevDojoJavaJiraya/Vio/File", "filetest02.txt");

        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write("Primeira vez que escrevo em um arquivo através do java!");
            fw.flush();  // Garante que o arquivo foi 100% escrevido antes de fechar
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
