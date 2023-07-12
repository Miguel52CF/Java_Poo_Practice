public class PokemonTest {
    public static void main(String[] args) {
        Pokedes pokedes = new Pokedes();
        Pokemon pikachu = pokedes.createPokemon("Pikachu", 100, "Electrico"); // Creado y atrapado
        Pokemon charmander = pokedes.createPokemon("Charmander", 100, "fuego"); // Creado y atrapado
        Pokemon ratatta = new Pokemon("rattata", 100, "normal"); // Creado sin atrapar
        pokedes.listPokemon();
        pikachu.attackPokemon(charmander);
        pokedes.mostar(pokedes.pokemonInfo(charmander));
        charmander.attackPokemon(ratatta);
        pokedes.mostar(pokedes.pokemonInfo(ratatta));
    }
}
