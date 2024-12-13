public class Student {
    //variables
    private String name;
    private String studentId;
    private int bookCount;
    private int classCount;
    private double lunchMoney;

    //constructor
    public Student(String name, String studentId, int bookCount, int classCount, double lunchMoney){
        this.name = name;
        this.studentId = studentId;
        this.bookCount = bookCount;
        this.classCount = classCount;
        this.lunchMoney = lunchMoney;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getStudentName() {
        return name;
    }
    public void setStudentID(String studentId) {
        this.studentId = studentId;
    }
    public String getStudentID() {
        return studentId;
    }
    public void setBookCount(int bookCount) {
        this.bookCount = bookCount;
    }
    public int getBookCount() {
        return bookCount;
    }
    public void setClassCount(int classCount) {
        this.classCount = classCount;
    }
    public int getClassCount() {
        return classCount;
    }
    public void setLunchMoney(double lunchMoney) {
        this.lunchMoney = lunchMoney;
    }
    public double getLunchMoney() {
        return lunchMoney;
    }
}
