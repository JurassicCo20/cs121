import java.util.Scanner;
class Sorting {
    Integer[] myArray = new Integer[5];
    private Scanner scnr = new Scanner(System.in);
    public Integer[] getArray(){
        int runThrough = 1;
        for (int i = 0; i < myArray.length; i++){
            n
            myArray[i] = numberOne;
            runThrough++;
        }
        return myArray;
    }
    public Integer[] sortArray(Integer[] myArray){
        int temp;
        for(int i = 0; i < myArray.length - 1; i++){
            for(int index = 0; index < myArray.length - i - 1; index++){
                if(myArray[index] > myArray[index + 1]){
                    temp = myArray[index];
                    myArray[index] = myArray[index + 1];
                    myArray[index + 1] = temp;
                }
            }
        }
        return myArray;
    }
}
