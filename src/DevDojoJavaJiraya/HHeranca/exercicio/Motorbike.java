package DevDojoJavaJiraya.HHeranca.exercicio;

public class Motorbike extends Vehicle {
    
    private int displacement;

    public Motorbike (String brand, int year, int displacement) {
        super(brand, year);
        this.displacement = displacement;
    }

    public int getDisplacement(){
        return this.displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public void showInformations(){
        super.showInformations();
        System.out.println("Displacement: " + this.displacement);
    }
}
