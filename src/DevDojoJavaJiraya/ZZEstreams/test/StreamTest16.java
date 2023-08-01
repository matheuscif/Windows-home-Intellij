package DevDojoJavaJiraya.ZZEstreams.test;

import java.util.stream.LongStream;
import java.util.stream.Stream;

// DESEMPENHO PARALLEL
/*
1. PARALLEL LONG STREAM ITERATE
2. FOR
3. SUM LONG STREAM ITERATE
4. SUM STREAM ITERATE
5. SUM PARALLEL STREAM ITERATE
 */
public class StreamTest16 {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        long num = 100_000_000;
        sumFor(num);
        sumStreamIterate(num);
        sumParallelStreamIterate(num);
        sumLongStreamIterate(num);
        sumParallelLongStreamIterate(num);
    }
    // FOR
    private static void sumFor(long num) {
        System.out.println("SUM FOR");
        long result = 0;
        long init = System.currentTimeMillis();
        for (long i = 1; i <= num; i++){
            result += 1;
        }
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }
    // Stream Iterate
    private static void sumStreamIterate(long num) {
        System.out.println("SUM STREAM ITERATE");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }
    // Stream Iterate Parallel
    private static void sumParallelStreamIterate(long num) {
        System.out.println("SUM PARALLEL STREAM ITERATE");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i + 1).limit(num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }
    // Long Stream Iterate
    private static void sumLongStreamIterate(long num) {
        System.out.println("SUM LONG STREAM ITERATE");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }
    // Parallel Long Stream Iterate
    private static void sumParallelLongStreamIterate(long num) {
        System.out.println("SUM PARALLEL LONG STREAM ITERATE");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }
}
