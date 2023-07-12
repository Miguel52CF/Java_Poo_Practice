import java.util.ArrayList;

public class Pokedes extends AbstractPokemon {

    @Override
    public void listPokemon() {
        ArrayList<Pokemon> pokedes = getMyPokemons();
        System.out.println("-------------Pokedes: " + (pokedes.size()) + "------------" + "\n");
        for (Pokemon pokemon : pokedes) {
            System.out.println("-------------Pokemon:-------------");
            System.out.println("Nombre: " + pokemon.getName());
            System.out.println("Tipo : " + pokemon.getType());
        }
        System.out.println("----------------------------------");
        System.out.println("Afuera de tu pokedes hay: " + (pokemon.getCount() - pokedes.size()) + " pokemon/nes \n");
    }

    public void mostar(String dato) {
        System.out.println(dato);
    }

}
