import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> nameList = new LinkedList<>();
        Student student1 = new Student("Arnold", "Palmer", 109358, "Math", "Freshman", 3.6);
        student1.addCourse("Statistics & Probability");
        student1.addCourse("Algebra");
        student1.addCourse("Geometry");
        System.out.println("\nPrint Student Info: ");
        student1.getStudentInfo(student1);
        System.out.println("\nPrint Unordered Student Courses: ");
        student1.getStudentCourses();
        student1.sortCourseList();
        System.out.println("\nPrint Ordered Student Courses: ");
        student1.getStudentCourses();
        student1.removeCourse("Geometry");
        System.out.println("\nPrint Removed Student Courses: ");
        student1.getStudentCourses();
    }
}