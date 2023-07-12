package clases;

public class Wizard extends Human {
    public Wizard() {
        setHealth(50);
        setIntelligence(8);
    }

    public Wizard(String name) {
        super(name);
        setHealth(50);
        setIntelligence(8);
    }

    public void heal(Human human) {
        int total = human.getHealth()+getIntelligence();
        human.setHealth(total);
        System.out.println("El hechizero: "+getName()+" Le restablecio la vida a: "+human.getName()+ " y quedo en: "+human.getHealth());
    }
    
    public void fireBall(Human human) {
        int total = human.getHealth()-getIntelligence()*3;
        human.setHealth(total);
        System.out.println("El hechizero: "+getName()+" quemo a: "+human.getName()+ " y su vida quedo en: "+human.getHealth());
    }

}
