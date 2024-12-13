package weekTwelve.activity25;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
public class Menu {
    private Scanner scnr = new Scanner(System.in);
    private Pokedex pokedex = new Pokedex();
    private void createPokemon(){
        String name;
        int hp;
        Pokemon poke;
        String moveName;
        int movePower;
        int moveSpeed;
        Move move;
        System.out.println("(1) Enter Pokemon details manually\n(2) Select Pokemon from a file");
        int choice = Integer.parseInt(scnr.nextLine());
        if(choice == 1){
            System.out.print("Enter Pokemon name: ");
            name = scnr.nextLine();
            System.out.print("Enter Pokemon HP: ");
            hp = scnr.nextInt();
            poke = new Pokemon(name,hp);
            addMoveToPokemon(poke);
            pokedex.addPokemon(poke);
            System.out.printf("%s added to Pokedex\n\n", name);
        }
        else if(choice == 2){
            FileRead newFile = new FileRead();
            ArrayList<String[]> pokemonData;
            try{
                pokemonData = newFile.readPokemonData("CharacterStatsFile.txt");
                if (pokemonData.isEmpty()){
                    System.out.println("No Pokemon data available");
                    return;
                }
                for(int i = 0; i < pokemonData.size(); i++){
                    System.out.printf("%d : %s", (i + 1), pokemonData.get(i)[0]);
                }
                int selectedIndex = Integer.parseInt(scnr.nextLine()) -1;

                if(selectedIndex >= 0 && selectedIndex < pokemonData.size()){
                    String [] selectedPokemonData = pokemonData.get(selectedIndex);
                    name = selectedPokemonData[0];
                    hp = Integer.parseInt(selectedPokemonData[1]);
                    moveName = selectedPokemonData[2];
                    movePower = Integer.parseInt(selectedPokemonData[3]);
                    moveSpeed = Integer.parseInt(selectedPokemonData[4]);

                    poke = new Pokemon(name, hp);
                    move = new Move(moveName, movePower, moveSpeed);
                    poke.addMove(move);

                    pokedex.addPokemon(poke);
                    System.out.println("The pokemon has been added to the Pokedex from the file data.");
                }
                else{
                    System.err.println(" FROM createPokemon() ERROR: invalid selection");
                }
            }
            catch(FileNotFoundException e){
                System.err.println(" FROM createPokemon() ERROR: POKEMON DATA FILE NOT FOUND");
            }
        }else{
            System.err.println("From createPokemon method() -> **** Invalid Entry ****");
        }

    }

    private void addMoveToPokemon(Pokemon pokemon){
        System.out.printf("Enter Moves for %s (or 'q' to quit) ");
        while(true){
            System.out.print("\tEnter a move name (or q if finished): ");
            String moveName = scnr.nextLine();
            if(moveName.equals("q")){
                break;
            }
            System.out.print("\tEnter move's power: ");
            int movePower = Integer.parseInt(scnr.nextLine());
            System.out.println("\tEnter move's speed: ");
            int moveSpeed = Integer.parseInt(scnr.nextLine());
            Move move = new Move(moveName, movePower, moveSpeed);
            pokemon.addMove(move);
        }
    }
    private void deletePokemon(){
        String name;
        Pokemon poke;
        System.out.print("Enter the name of the Pokemon you want to delete: ");
        name = scnr.nextLine();
        poke = pokedex.getPokemon(name);
        if(poke == null){
            System.out.println("Pokemon not found");
        }
        else{
            pokedex.removePokemon(poke);
            System.out.printf("%s removed for Pokedex\n", name);
        }
    }
    private void displayPokemon(){
        String name;
        Pokemon poke;
        System.out.print("Enter the name of the Pokemon you want to display: ");
        name = scnr.nextLine();
        poke = pokedex.getPokemon(name);
        if(poke == null){
            System.out.println("Pokemon not found.");
        }
        else{
            System.out.println(poke);
        }
    }
    private void displayAllPokemon(){
        ArrayList<Pokemon> pokemonArrayList = pokedex.getAllPokemon();
        if(pokemonArrayList.isEmpty()){
            System.out.println("No Pokemon in the Pokedex!");
            return;
        }
        System.out.println("All Pokemon in the pokedex");
        for(Pokemon pokemon : pokemonArrayList){
            System.out.printf("Name: %s\n", pokemon.getName());
            System.out.printf("HP: %d\n", pokemon.getHp());

            ArrayList<Move> movesArrayList = pokemon.getMoveArrayList();
            if(movesArrayList.isEmpty()){
                System.out.println("No moves available for this pokemon!");
            }
            else{
                System.out.println("Moves:");
                for(Move move : movesArrayList){
                    System.out.printf("\t\t Move Names: %s\n", move.getMoveName());
                    System.out.printf("\t\t Move Power: %d\n", move.getMovePower());
                    System.out.printf("\t\t Move Speed: %d\n", move.getMoveSpeed());
                }
            }
            System.out.println();
        }
    }
    public void displayMenu(){
        int select;
        String stars = "*".repeat(9);
        while(true){
            System.out.printf("\n%s MENU %s", stars, stars);
            System.out.println("Please make a selection: \n" + "1) Add a Pokemon\n" + "2) Remove a Pokemon\n" + "3) Display Pokemon Info\n" + "4) Display All Pokemon Info\n" + "5) Exit\n >> ");
            select = Integer.parseInt(scnr.nextLine());
            if(select == 1){
                createPokemon();
            }
            else if(select == 2){
                deletePokemon();
            }
            else if(select == 3){
                displayPokemon();
            }
            else if(select == 4){
                displayAllPokemon();
            }
            else if(select == 5){
                System.out.println("Exiting...");
                break;
            }
            else{
                System.out.println("Invalid entry");
            }
        }
    }
}
