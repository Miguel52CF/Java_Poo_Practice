package clases;

public class Human{

    private String name;
    private int strength = 3; 
    private int intelligence = 3;
    private int stealth = 3;
    private int health = 100;

    public Human() {
    }

    public Human(String name) {
        this.name=name;
    }

    public void attack(Ninja ninja) {
        int salud= ninja.getHealth();
        ninja.setHealth(salud-=getStrength());
        System.out.println(ninja.getName()+" fue atacado por: " + getName()+ " y su salud quedo en: "+ninja.getHealth());
    }

    public void attack(Samurai samurai) {
        int salud= samurai.getHealth();
        samurai.setHealth(salud-=getStrength());
        System.out.println(samurai.getName()+" fue atacado por: " + getName()+ " y su salud quedo en: "+samurai.getHealth());
    }
    
    public void attack(Wizard wizard) {
        int salud= wizard.getHealth();
        wizard.setHealth(salud-=getStrength());
        System.out.println(wizard.getName()+" fue atacado por: " + getName()+ " y su salud quedo en: "+wizard.getHealth());
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getStealth() {
        return stealth;
    }

    public void setStealth(int stealth) {
        this.stealth = stealth;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}

