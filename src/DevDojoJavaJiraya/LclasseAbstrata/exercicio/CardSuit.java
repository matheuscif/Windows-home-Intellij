package DevDojoJavaJiraya.LclasseAbstrata.exercicio;

public enum CardSuit {
    CLUBS(4,"clubs"), // paus
    HEARTS(3, "hearts"),
    SPDADES(2, "spades"),
    DIAMONDS(1, "diamonds");

    private int value;
    private String name;

    CardSuit (int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return this.value;
    }

    public String getName(){
        return this.name;
    }
}
