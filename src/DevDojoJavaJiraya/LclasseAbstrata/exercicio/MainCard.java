package DevDojoJavaJiraya.LclasseAbstrata.exercicio;

public class MainCard {
    public static void main(String[] args) {
        NumberCard numberCard = new NumberCard("10", CardSuit.SPDADES);
        SpecialCard specialCard = new SpecialCard(EnumSpecialCards.JACK, CardSuit.CLUBS);

        numberCard.show();
        System.out.println(numberCard.score());

        specialCard.show();
        System.out.println(specialCard.score());
    }
}
