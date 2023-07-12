import java.util.ArrayList;

public abstract class AbstractPokemon implements Ipokemon {
    private static ArrayList<Pokemon> myPokemons = new ArrayList<>();

    Pokemon pokemon = new Pokemon();

    @Override
    public Pokemon createPokemon(String name, int health, String type) {
        Pokemon pokemon = new Pokemon(name, health, type);
        setMyPokemons(pokemon);
        return pokemon;
    }

    @Override
    public String pokemonInfo(Pokemon pokemon) {
        String info = "Nombre: " + pokemon.getName() + " vida: " + pokemon.getHealth() + " tipo: " + pokemon.getType();
        return info;
    }

    public static ArrayList<Pokemon> getMyPokemons() {
        return myPokemons;
    }

    public static void setMyPokemons(Pokemon pokemon) {
        myPokemons.add(pokemon);
    }
}
