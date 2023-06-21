package DevDojoJavaJiraya.JmodificadorFinal.exercicio.ex;

public final class Circulo {
    private double raio;
    private final double pi = 3.141592;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return pi * (raio * raio);
    }

    public double calcularPerimetro() {
        return 2 * pi * raio;
    }

    public void showInformations() {
        System.out.println("Raio: " + raio);
        System.out.println("Área: " + this.calcularArea());
        System.out.println("Perímetro: " + this.calcularPerimetro());
    }
}


