package weekSeven;

public class Student {
    String studentName;
    int studentID;
    String major;

    //Constructor
    // public NameOfYourClass()
    // Default Constructor
    public Student() {
        this.studentName = "No Name";
        this.studentID = 000;
        this.major = "No Major";
    }

    public Student(String name, int SID, String major){
        this.studentName = name;
        this.studentID = SID;
        this.major = major;
    }

    public void displayStudentInfo(){
        System.out.printf("The name of Student: %s\nStudent ID: %d\nStudent's Major: %s", this.studentName, this.studentID, this.major);
    }
}
