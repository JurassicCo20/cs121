public class Recursion {
    public String countDown(int number){
        if(number == 0){
            return "Blast Off!";
        }
        else{
            System.out.print(number + "...");
            return countDown(number - 1);
        }
    }
    public char alphaBackwards(char letter){
        if(letter == 'a'){
            return letter;
        }
        else{
            System.out.print(letter + " ");
            int intletter = (int) letter - 1;
            return alphaBackwards((char) intletter);
        }
    }
}
