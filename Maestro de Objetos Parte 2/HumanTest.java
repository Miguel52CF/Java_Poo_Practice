import clases.Ninja;
import clases.Samurai;
import clases.Wizard;

public class HumanTest {
    public static void main(String[] args) {
        Samurai samurai = new Samurai("Jack");
        Ninja ninja = new Ninja("Naruto");
        Wizard wizard = new Wizard("Lucas");

        wizard.heal(samurai);
        wizard.fireBall(ninja);
        ninja.steal(wizard);
        ninja.runAway();
        samurai.deathBlow(ninja);
        samurai.meditate();
        int saludFinal= samurai.howMany();
        System.out.println(saludFinal);
    }
}