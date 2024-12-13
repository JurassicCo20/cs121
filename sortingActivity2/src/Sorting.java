import java.util.Scanner;
class Sorting {
    Integer[] myArray = new Integer[5];
    private Scanner scnr = new Scanner(System.in);
    public Integer[] getArray(){
        int runThrough = 1;
        for (int i = 0; i < myArray.length; i++){
            System.out.printf("Enter your number #%d: ", runThrough);
            int numberOne = scnr.nextInt();
            myArray[i] = numberOne;
            runThrough++;
        }
        return myArray;
    }
    public Integer[] sortArray(Integer[] myArray){
        int temp;
        for(int i = 1; i < myArray.length; i++){
            for(int index = i; index > 0; index--){
                if(myArray[index] < myArray[index - 1]){
                    temp = myArray[index];
                    myArray[index] = myArray[index - 1];
                    myArray[index - 1] = temp;
                }
            }
        }
        return myArray;
    }
}
