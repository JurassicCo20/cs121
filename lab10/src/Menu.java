import java.util.Scanner;
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

        System.out.print("Enter Pokemon name: ");
        name = scnr.nextLine();
        System.out.print("Enter Pokemon HP: ");
        hp = scnr.nextInt();
        poke = new Pokemon(name,hp);

        System.out.printf("Enter Moves for %s.\n", name);
        while(true){
            System.out.print("\tEnter a move name or q if " + "finished: ");
            moveName = scnr.nextLine();
            if(moveName.equals("q")){
                break;
            }
            System.out.print("\tEnter move's power: ");
            movePower = Integer.parseInt(scnr.nextLine());
            System.out.println("\tEnter move's speed: ");
            moveSpeed = Integer.parseInt(scnr.nextLine());
            move = new Move(moveName, movePower, moveSpeed);
            poke.addMove(move);
        }
        pokedex.addPokemon(poke);
        System.out.printf("%s added to Pokedex\n\n", name);
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
        System.out.println(pokedex.getAllPokemon());
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
