import animales.Gorilla;

public class GorillaTest {
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla("jorge");
        gorilla.throwSomething();
        gorilla.throwSomething();
        gorilla.throwSomething();
        gorilla.eatBananas();
        gorilla.eatBananas();
        gorilla.climb("arbol");
        gorilla.displayEnergy();
    }
}