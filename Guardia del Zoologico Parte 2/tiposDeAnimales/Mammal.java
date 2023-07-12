package tiposDeAnimales;

import animales.Animal;

public class Mammal extends Animal {

    public Mammal() {
    }

    public Mammal(String name) {
        super(name);
    }

    public int displayEnergy() {
        System.out.println("La energia de " + getNombre() + " es: " + getEnergy());
        return getEnergy();
    }
}
