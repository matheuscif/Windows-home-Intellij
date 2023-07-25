package DevDojoJavaJiraya.ZZBcomportamento.Interfaces;

import DevDojoJavaJiraya.ZZBcomportamento.dominio.Car;

@FunctionalInterface
public interface CarPredicate {
    boolean test(Car car);
}
