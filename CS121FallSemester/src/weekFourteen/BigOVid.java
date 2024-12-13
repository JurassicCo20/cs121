package weekFourteen;

public class BigOVid {
    public static void main(String[] args) {
        printOneTime("Billy");
        String[] students = {"Alice","Bob","Charlie","David","Ella","Frank",
                "Grace","Hannah","Ian","Jack","Katie","Luke","Mona","Nate","Olivia","Paul",
                "Quinn","Rachel","Steve","Tina","Uma","Victor","Wendy","Xander",
                "Yara","Zane"};
        int index = binarySearch( students, "Nate");
        if(index != -1){
            System.out.println("Nate is found at index " + index);
        }
        else{
            System.out.println("Nate is not found in this array");
        }
        printNTimes(students);
    }

    public static void printOneTime(String name){
        System.out.println(name);
    }
    public static void printNTimes(String[] array){
        for(String name: array){
            System.out.println(name);
        }
    }
    public static int binarySearch(String[] array, String value){
        int low = 0;
        int high = array.length - 1;

        while(low <= high){
            int mid = low + (high - low) / 2;
            int result = value.compareTo(array[mid]);

            if (result == 0){
                return mid;
            }
            else if (result > 0){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }
}
