package DevDojoJavaJiraya.LclasseAbstrata.exercicio;

public abstract class Card {
    protected String value;
    protected EnumSpecialCards specialCards;
    protected CardSuit suit;

    Card (EnumSpecialCards specialCards, CardSuit suit) {
        this.specialCards = specialCards;
        this.suit = suit;
    }
    Card (String value, CardSuit suit) {
        this.value = value;
        this.suit = suit;
    }

    public abstract void show();

    public abstract int score();

}
