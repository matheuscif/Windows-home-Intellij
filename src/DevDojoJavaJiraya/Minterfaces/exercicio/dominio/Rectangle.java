package DevDojoJavaJiraya.Minterfaces.exercicio.dominio;

public class Rectangle implements GeometricForm{
    private double side;
    private double height;
    private final double AREA;
    private final double PERIMETER;

    public Rectangle(double side, double height) {
        this.side = side;
        this.height = height;
        this.AREA = this.height * this.side;
        this.PERIMETER = (2 * this.height) + (2 * this.side);
    }

    @Override
    public double calculateArea() {
        return this.AREA;
    }

    @Override
    public double calculatePerimeter() {
        return this.PERIMETER;
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

    @Override
    public String toString() {
        return "Rectangle{" +
                "side=" + side +
                ", height=" + height +
                ", AREA=" + AREA +
                ", PERIMETER=" + PERIMETER +
                '}';
    }
}
