package clases;

public class Ninja extends Human {

    public Ninja() {
    }

    public Ninja(String name) {
        super(name);
        setIntelligence(5);
    }

    public void steal(Human human) {
        int total = human.getHealth();
        human.setHealth(total-getStealth());
        setHealth(getHealth()+getStealth());
        System.out.println("El ninja: "+getName()+" Le robo "+getStealth()+" de vida a: "+human.getName());
        System.out.println("la vida de: "+ human.getName()+" quedo en: "+human.getHealth()+" y la de: "+getName()+" en: "+getHealth());
    }

    public void runAway() {
        setHealth(getHealth()-10);
        System.out.println(getName()+" Huyo y su vida quedo en: "+getHealth());
    }
}
