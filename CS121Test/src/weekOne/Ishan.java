package weekOne;

public class Ishan {
    public static void main(String[] args) {
        int age;
        double gpa;
        char letterGrade;
        boolean csMajor;
        String name;

        age = 13;
        gpa = 4.0;
        letterGrade = 'A';
        csMajor = false;
        name = "Ishan";
        String favoriteColor = "Green";

        System.out.printf("The age of this person is: %d%n",age);
        System.out.printf("The gpa is %.2f%n",gpa);
        System.out.printf("The letter grade is: %c%n",letterGrade);
        System.out.printf("Is it true that your major in computer Science? %b%n",csMajor);
        System.out.printf("This persons name is: %s%n",name);

        System.out.println("Your age is: " + age);
        System.out.print("Your favorite color is " + favoriteColor);
    }
}
