import clases.Ninja;
import clases.Samurai;

public class HumanTest {
    public static void main(String[] args) {
        Samurai samurai = new Samurai("Jack");
        Ninja ninja = new Ninja("Naruto");

        samurai.attack(ninja);
        ninja.attack(samurai);
        
    }
}