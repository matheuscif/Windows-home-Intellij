package DevDojoJavaJiraya.LclasseAbstrata.exercicio;

public class NumberCard extends Card {

    public NumberCard (String value, CardSuit suit) {
        super(value, suit);
    }

    @Override
    public void show() {
        System.out.println(value + " " + suit.getName());

    }

    @Override
    public int score() {
        return super.suit.getValue() + Integer.parseInt(value);
    }
}
