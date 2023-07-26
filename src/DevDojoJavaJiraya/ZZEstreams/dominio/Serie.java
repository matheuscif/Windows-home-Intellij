package DevDojoJavaJiraya.ZZEstreams.dominio;

public class Serie {
    private String title;
    private double price;

    public Serie(String title, double price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}
