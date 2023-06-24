package DevDojoJavaJiraya.Minterfaces.exercicio.dominio;

public class Circle implements GeometricForm{

    private double radius;
    private final double PI = 3.14;
    private final double AREA;
    private final double PERIMETER;


    public Circle(double radius) {
        this.radius = radius;
        this.AREA = this.radius * this.radius * PI;
        this.PERIMETER = this.radius * 2 * PI;
    }
    @Override
    public double calculateArea() {
        return this.AREA;
    }

    @Override
    public double calculatePerimeter() {
        return this.PERIMETER;
    }

    public double getRadius() {
        return this.radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", PI=" + PI +
                ", AREA=" + AREA +
                ", PERIMETER=" + PERIMETER +
                '}';
    }
}
