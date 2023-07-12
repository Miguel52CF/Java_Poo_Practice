package animales;

import tiposDeAnimales.Mammal;

public class Gorilla extends Mammal {

    public Gorilla() {
    }

    public Gorilla(String name) {
        super(name);
    }

    public void throwSomething() {
        int energy = getEnergy();
        energy -= 5;
        setEnergy(energy);
        System.out.println(getNombre() + " lanzo un objecto y su nivel de energia es: " + energy);
    }

    public void eatBananas() {
        int energy = getEnergy();
        energy += 10;
        setEnergy(energy);
        System.out.println(getNombre() + " se comio una rica banana y recupero su energia quedando en: " + energy);
    }

    public void climb() {
        int energy = getEnergy();
        energy -= 10;
        setEnergy(energy);
        System.out.println(getNombre() + " trepo una colina y su energia descendio a" + energy);
    }

    public void climb(String string) {
        int energy = getEnergy();
        energy -= 10;
        setEnergy(energy);
        System.out.println(getNombre() + " trepo un/una " + string + " y su energia descendio a " + energy);
    }
}
