package DevDojoJavaJiraya.HHeranca.exercicio;

public class Vehicle {
    private String brand;
    private int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    } 

    public void showInformations() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Year of manufactory: " + this.year);
    }
    
}
