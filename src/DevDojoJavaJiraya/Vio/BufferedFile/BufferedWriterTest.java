package DevDojoJavaJiraya.Vio.BufferedFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest {
    public static void main(String[] args) {
        File file = new File("/home/mad0c/Documents/IntellijRep/Windows-home-Intellij/src/DevDojoJavaJiraya/Vio/BufferedFile", "fiel-buffered.txt");
        try (FileWriter fw = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("Escrevendo usando java Buffered Writer");
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
