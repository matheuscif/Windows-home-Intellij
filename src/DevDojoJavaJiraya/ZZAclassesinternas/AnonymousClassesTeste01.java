package DevDojoJavaJiraya.ZZAclassesinternas;

// CLASSE SECUNDARIA
class Animal {
    public void walk() {
        System.out.println("Animal walking");
    }
}
public class AnonymousClassesTeste01 {
    public static void main(String[] args) {
        Animal animal = new Animal() { // CLASSE ANONIMA
            @Override
            public void walk() { // METODO SOBRESCRITO PRA CLASSE ANONIMA
                System.out.println("Walking in the shadows");
            }
        };
        animal.walk();
    }
}
