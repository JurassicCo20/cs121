import java.util.Scanner;

public class Menu {
    private Scanner scnr = new Scanner(System.in);
    private StudentRecord studentRecord = new StudentRecord();
    public Menu(){
    }
    private void addStudent(){
        String name;
        int gpa;
        int id;
        Student student;
        String courseName;
        String courseProf;
        int courseCap;
        Course course;

        System.out.print("Enter Student's name: ");
        name = scnr.nextLine();
        System.out.print("Enter Student's GPA: ");
        gpa = scnr.nextInt();
        System.out.print("Enter Student's ID: ");
        id = scnr.nextInt();
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
            student.addCourse(courseName, course);
        }
        studentRecord.addStudent(id,student);
        System.out.printf("%s added to Student Record\n\n", name);
    }
    private void deleteStudent(){
        int id;
        Integer student;
        System.out.print("Enter ID of the Student you want to delete: ");
        id = scnr.nextInt();
        student = studentRecord.getStudent(id);
        if(student == null){
            System.out.println("Student not found");
        }
        else{
            studentRecord.removeStudent(student);
            System.out.printf("Removed student off Student Record: %d\n", id);
        }
    }
    private void displayStudent(){
        int id;
        Integer student;
        System.out.print("Enter the ID of the student you want to display: ");
        id = scnr.nextInt();
        student = studentRecord.getStudent(id);
        if(student == null){
            System.out.println("Student not found.");
        }
        else{
            System.out.println(student.toString());
        }
    }
    private void displayAllStudents(){
        System.out.println(studentRecord.getAllStudents());
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
