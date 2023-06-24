package DevDojoJavaJiraya.LclasseAbstrata.exercicio;

public class NumberCard extends Card {

    public NumberCard (String value, CardSuit suit) {
        super(value, suit);
    }

    @Override
    public void show() {

    }

    @Override
    public int score() {
        return super.suit.getValue() + (Integer) super.value;
    }
}
