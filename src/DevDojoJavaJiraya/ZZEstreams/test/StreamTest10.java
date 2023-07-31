package DevDojoJavaJiraya.ZZEstreams.test;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class StreamTest10 {
    public static void main(String[] args) {
        // ITERATE
        // 1. números de 2 em 2
        Stream.iterate(1, n -> n + 2)
                .limit(10)
                .forEach(System.out::print);
        System.out.println();
        // 2. sequência de fibonnacci (pares de soma)
        Stream.iterate(new int[]{0,1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(10)
                .forEach(a -> System.out.println(Arrays.toString(a)));
        // 3. sequência de fibonnaci (apenas números)
        Stream.iterate(new int[]{0,1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(10)
                .map(a -> a[0])
                .forEach(System.out::println);

        // GENERATE, gerando números aleatórios
        ThreadLocalRandom random = ThreadLocalRandom.current();
        Stream.generate(() -> random.nextInt(1,1000))
                .limit(10)
                .forEach(System.out::println);

    }
}
