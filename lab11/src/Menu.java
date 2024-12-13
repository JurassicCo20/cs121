import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Menu {
    private Scanner scnr = new Scanner(System.in);
    private StudentRecord studentRecord = new StudentRecord();
    public Menu(){
    }
    private void addStudent(){
        String name;
        int gpa;
        Student student;
        String courseName;
        String courseProf;
        int courseCap;
        Course course;

        System.out.print("Enter Student's name: ");
        name = scnr.nextLine();
        System.out.print("Enter Student's GPA: ");
        gpa = scnr.nextInt();
        student = new Student(name,gpa);

        System.out.printf("Enter Courses for %s.\n", name);
        while(true){
            System.out.print("\tEnter a course name or q if " + "finished: ");
            courseName = scnr.nextLine();
            if(courseName.equals("q")){
                break;
            }
            System.out.print("\tEnter the course's professor: ");
            courseProf = scnr.nextLine();
            System.out.println("\tEnter the course's max capacity: ");
            courseCap = Integer.parseInt(scnr.nextLine());
            course = new Course(courseName, courseProf, courseCap);
            student.addCourse(course);
        }
        studentRecord.addStudent(student);
        System.out.printf("%s added to Student Record\n\n", name);
    }
    private void deleteStudent(){
        String name;
        Student student;
        System.out.print("Enter the name of the Pokemon you want to delete: ");
        name = scnr.nextLine();
        student = studentRecord.getPokemon(name);
        if(student == null){
            System.out.println("Student not found");
        }
        else{
            studentRecord.removeStudent(student);
            System.out.printf("%s removed for Student Record\n", name);
        }
    }
    private void displayStudent(){
        String name;
        Student student;
        System.out.print("Enter the name of the student you want to display: ");
        name = scnr.nextLine();
        student = studentRecord.getPokemon(name);
        if(student == null){
            System.out.println("Student not found.");
        }
        else{
            System.out.println(student.toString());
        }
    }
    public void displayMenu(){
        int select;
        String stars = "*".repeat(9);
        while(true){
            System.out.printf("\n%s MENU %s", stars, stars);
            System.out.println("Please make a selection: \n" + "1) Add a Student\n" + "2) Remove a Student\n" + "3) Display Student Info\n" + "4) Display All Student Info\n" + "5) Exit\n >> ");
            select = Integer.parseInt(scnr.nextLine());
            if(select == 1){
                addStudent();
            }
            else if(select == 2){
                deleteStudent();
            }
            else if(select == 3){
                displayStudent();
            }
            else if(select == 4){
                displayAllStudents();
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
