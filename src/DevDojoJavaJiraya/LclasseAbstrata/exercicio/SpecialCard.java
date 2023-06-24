package DevDojoJavaJiraya.LclasseAbstrata.exercicio;

public class SpecialCard extends Card {

    public SpecialCard(EnumSpecialCards specialCards, CardSuit suit) {
        super(specialCards,suit);
        
    }

    @Override
    public void show(){
        System.out.println(super.specialCards.getName() + " " + super.suit.getName());
    }

    @Override
    public int score() {
        return super.specialCards.getValue() + super.suit.getValue();
    }

    
}
