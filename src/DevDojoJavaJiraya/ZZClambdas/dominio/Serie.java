package DevDojoJavaJiraya.ZZClambdas.dominio;

public class Serie {
    private String title;
    private int episodes;

    public Serie(String title, int episodes) {
        this.title = title;
        this.episodes = episodes;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "title='" + title + '\'' +
                ", episodes=" + episodes +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public int getEpisodes() {
        return episodes;
    }
}
