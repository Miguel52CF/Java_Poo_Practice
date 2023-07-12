package animales;

import tiposDeAnimales.Mammal;

public class Bat extends Mammal {
    public Bat() {
    }

    public Bat(String name) {
        super(name);
    }

    public void fly() {
        int energy = getEnergy();
        energy -= 50;
        setEnergy(energy);
        System.out.println("¡zas! " +getNombre() +" y su energia quedo en: "+ energy);
    }

    public void eatHumans() {
        int energy = getEnergy();
        energy += 25;
        setEnergy(energy);
        System.out.println("Aghgggggh "+getNombre() + " me mordio, bueno no importa ya que su energia quedo en: " + energy);
    }

    public void attackTown() {
        int energy = getEnergy();
        energy -= 100;
        setEnergy(energy);
        System.out.println("Aghgggggh "+getNombre() + " ataco la ciudad y ahora esta en llamas");
        System.out.println("su nivel de energia ahora es: " + energy);
    }

}
