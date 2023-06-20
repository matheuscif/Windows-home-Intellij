package DevDojoJavaJiraya.HHeranca.exercicio;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW", 2020, "X6");
        Motorbike motorbike = new Motorbike("Harley", 2022, 883);

        car.showInformations();
        motorbike.showInformations();

    }
    
}
