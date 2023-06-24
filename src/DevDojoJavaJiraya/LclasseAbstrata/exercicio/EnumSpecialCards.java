package DevDojoJavaJiraya.LclasseAbstrata.exercicio;

public enum EnumSpecialCards {
    JACK(11, "jack"),
    QUEEN(12, "queen"),
    KING(13, "king"),
    ACE(14, "ace");

    private int value;
    private String name;

    EnumSpecialCards(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getValue(){
        return this.value;
    }
    
}
