package DevDojoJavaJiraya.LclasseAbstrata.exercicio;

public abstract class Card {
    Object value;
    CardSuit suit;

    Card (Object value, CardSuit suit) {
        this.value = value;
        this.suit = suit;
    }



    public abstract void show();

    public abstract int score();


}
