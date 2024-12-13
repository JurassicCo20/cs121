public class GCD {
    public int findGCDForLoop(int num1, int num2){
        int gcd = 1;
        for (int i = 1; i < num1 || i < num2; i++){
            if(num1 % i == 0 && num2 % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }
    public int findGCDWhileLoop(int num1, int num2){
        int greaterNumber = 5;
        int smallerNumber = 5;
        if(num1 > num2){
            num1 = greaterNumber;
            num2 = smallerNumber;
        }
        else{
            num2 = greaterNumber;
            num1 = smallerNumber;
        }
        while(greaterNumber != smallerNumber){
            greaterNumber -= smallerNumber;
        }
        return num1;
    }
    public int findGCDRecursively(int num1, int num2){
        int number1 = num1;
        while(num2 != 0){
            number1 = num2;
            num2 = num1 % num2;
            num1 = number1;
        }
        return number1;
    }
}
