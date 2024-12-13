import java.util.ArrayList;
public class Pokedex {
    private ArrayList<Pokemon> pokemonArrayList = new ArrayList<>();
    public void addPokemon(Pokemon pokemon){
        pokemonArrayList.add(pokemon);
    }
    public void removePokemon(Pokemon pokemon){
        pokemonArrayList.remove(pokemon);
    }
    public Pokemon getPokemon(String pokemonName){
        Pokemon foundPokemon = null;
        for(Pokemon p: pokemonArrayList){
            if(p.getName().equals(pokemonName)){
                foundPokemon = p;
                break;
            }
        }
        return foundPokemon;
    }
    public ArrayList<Pokemon> getAllPokemon(){
        return pokemonArrayList;
    }
}
