import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> nameList = new LinkedList<>();
        Student student1 = new Student("Arnold", "Palmer", 109358, "Math", "Freshman");
        Student student2 = new Student("Keke", "Palmer", 235858, "Sociology", "Senior");
        student1.addCourse("Statistics & Probability");
        student1.addCourse("Algebra");
        student1.addCourse("Geometry");
        student2.addCourse("Psychology");
        student2.addCourse("Anatomy");
        student2.addCourse("Finance");
        student1.getStudentInfo(student1);
        student1.displayStudentCourses();
        student1.removeCourse("Geometry");
        student1.displayStudentCourses();
        student2.getStudentInfo(student2);
        student2.displayStudentCourses();
        student2.removeCourse("Finance");
        student2.displayStudentCourses();
    }
}