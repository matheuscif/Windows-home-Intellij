package DevDojoJavaJiraya.ZZEstreams.test;

import java.util.List;

public class StreamTest07 {
    // REDUCE
    public static void main(String[] args) {
        List<Integer> integers = List.of(1,2,3,4,5,6);

        // somando valores
        integers.stream()
                .reduce((x,y) -> x + y)
                .ifPresent(System.out::println);

        //somando direto no println
        System.out.println(integers.stream().reduce(0, (x,y) -> x + y));

        System.out.println("--------------------------");

        // Multiplicando
        integers.stream()
                .reduce((x, y) -> x*y)
                .ifPresent(System.out::println);

        // maneira feia de retornar maior número
        System.out.println("-----------------");
        integers.stream()
                .reduce((x,y) -> x > y ? x : y)
                .ifPresent(System.out::println);

        // maneira bonita de retornar maior número
        System.out.println(integers.stream().reduce(0, Integer::max));
    }
}
