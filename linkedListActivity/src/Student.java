import java.util.ArrayList;
import java.util.LinkedList;
public class Student {
    private String firstName;
    private String lastName;

    private int ID;
    private String major;
    private String classStanding;

    private double gpa;
    private LinkedList<String> nameList = new LinkedList<>();

    public class LinkedListDemo {
        public static void main(String[] args) {

        }
    }
    public Student(String firstName, String lastName, int ID, String major, String classStanding, double gpa){
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.major = major;
        this.classStanding = classStanding;
        this.gpa = gpa;
    }

    public void addCourse(String course){
        nameList.add(course);
    }
    public void removeCourse(String course){
        nameList.remove(course);
    }
    public void getStudentInfo(Student studentName){
        System.out.printf("Student First Name: %s\n", studentName.firstName);
        System.out.printf("Student Last Name: %s\n", studentName.lastName);
        System.out.printf("Student ID: %d\n", studentName.ID);
        System.out.printf("Student Major: %s\n", studentName.major);
        System.out.printf("Student Class Standing: %s\n", studentName.classStanding);

    }
    public void displayStudentCourses(){
        System.out.println("COURSES:");
        for(String course : nameList){
            System.out.println(course);
        }
    }

}
