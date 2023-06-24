package DevDojoJavaJiraya.Minterfaces.exercicio.dominio;

public class Rectangle implements GeometricForm{
    private double side;
    private double height;

    Rectangle(double side, double height) {
        this.side = side;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return this.side * this.height;
    }

    @Override
    public double calculatePerimeter() {
        return (this.side * 2) + (this.height * 2);
    }

    public double getSide(){
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getHeight(){
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
