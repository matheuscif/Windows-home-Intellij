package DevDojoJavaJiraya.Minterfaces.exercicio.test;

import DevDojoJavaJiraya.Minterfaces.exercicio.dominio.Circle;
import DevDojoJavaJiraya.Minterfaces.exercicio.dominio.Rectangle;

public class MainGemoetricFormInterface {
    public static void main(String[] args) {
        Circle circle = new Circle(3.0);
        Rectangle rectangle = new Rectangle(4,3);

        System.out.println("Circle: " + circle.calculateArea());
        System.out.println("Rectangle: " + rectangle.calculateArea());

        System.out.println(circle.toString());
        System.out.println();
        System.out.println(rectangle.toString());

    }
}
