package DevDojoJavaJiraya.HHeranca.exercicio;

public class Car extends Vehicle {
    private String model;


    public Car(String brand, int year, String model) {
        super(brand, year);
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void showInformations() {
        super.showInformations();
        System.out.println("Model: " + this.model);
    }

}
