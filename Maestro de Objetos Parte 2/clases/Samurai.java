package clases;

public class Samurai extends Human {
    public Samurai() {
        setHealth(200);
        setIntelligence(5);
    }

    public Samurai(String name) {
        super(name);
        setHealth(200);
        setIntelligence(5);
    }

    public void deathBlow(Human human) {
        human.setHealth(0);
        setHealth(Math.round(getHealth() / 2));
        System.out.println(human.getName() + " esta muerto su vida es: " + human.getHealth());
        System.out.println("Pero " + getName() + " quedo a: " + getHealth() + " de vida D:");
    }

    public void meditate() {
        int extra = Math.round(getHealth() / 2);
        setHealth(getHealth() + extra);
        System.out.println(getName() + " medito y recupero: " + extra + " de vida quedando en: " + getHealth() + " :D");
    }

    public int howMany() {
        int temp= getHealth();
        return temp;
    }
}
