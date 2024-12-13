import java.util.ArrayList;
public class Pokemon {
    private String name;
    private int hp;
    private ArrayList<Move> moveArrayList = new ArrayList<>();

    public Pokemon(String name, int hp){
        this.name = name;
        this.hp = hp;
    }

    public void addMove(Move move){
        moveArrayList.add(move);
    }
    public void removeMove(Move move){
        moveArrayList.remove(move);
    }
    public Move getMove(String moveName){
        Move foundMove = null;
        for(Move move: moveArrayList){
            if(move.getMoveName().equals(moveName)){
                foundMove = move;
                break;
            }
        }
        return foundMove;
    }
    public ArrayList<Move> getAllMoves(){
        return moveArrayList;
    }
    @Override
    public String toString(){
        return String.format("Name: %s\n" + "HP: %d\n", name, hp);
    }

    public String getName() {
        return name;
    }
}
