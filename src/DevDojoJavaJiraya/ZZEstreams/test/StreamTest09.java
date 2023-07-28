package DevDojoJavaJiraya.ZZEstreams.test;

import java.io.IOError;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest09 {
    // GERANDO STREAM
    public static void main(String[] args) {
        // gerando numeros pares de 1 a 50
        IntStream
                .rangeClosed(1,50)
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n +" "));
        System.out.println();
        // concatenando stream de strings
        Stream.of("Eleve","O","Cosmo","no seu coração")
                .map(String::toUpperCase)
                .forEach(s -> System.out.print(s + " "));
        System.out.println();
        // average(media) de array stream
        int num[] = {1,2,3,4,5};
        Arrays.stream(num)
                .average()
                .ifPresent(System.out::println);

        // stream com files filtrando apenas linhas com a palavra "Java"

        try(Stream<String> lines = Files.lines(Paths.get("file.txt"))) {
            lines.filter(l -> l.contains("Java")).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
