package DevDojoJavaJiraya.Vio.File;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) {
        File file = new File("/home/mad0c/Documents/IntellijRep/Windows-home-Intellij/src/DevDojoJavaJiraya/Vio/File", "filetest02.txt");
        /*
        Para ler usando a classe FileReader, vc precisa de uma variável vazia e usa-la para percorrer o file
        por padrão, quando o file termina ele retorna -1
        pouco eficiente pois o loop tem que ser executado para cada char do arquivo
        também é preciso fazer o cast para (char) para não retornar ASCII
         */

        try (FileReader fr = new FileReader(file)) {
            int i;
            while((i = fr.read()) != -1 ){
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
