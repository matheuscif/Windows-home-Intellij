package DevDojoJavaJiraya.Vio.BufferedFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {
    public static void main(String[] args) {
        File file = new File("/home/mad0c/Documents/IntellijRep/Windows-home-Intellij/src/DevDojoJavaJiraya/Vio/BufferedFile", "fiel-buffered.txt");

        try(FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr)) {
            String linha;
            while((linha = br.readLine()) != null){
                System.out.println(linha);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
