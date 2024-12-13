public class StudentTest {
    public static void main(String[] args){
        Student student1 = new Student("Louis Mann", "12345", 5, 6, 35.17);
        System.out.println("STUDENTS:");
        System.out.println( student1.getStudentName());
        student1.setName("Louis Mann Jr.");
        System.out.println( student1.getStudentName());
        System.out.println("ID:");
        System.out.println( student1.getStudentID());
        student1.setStudentID("15698");
        System.out.println( student1.getStudentID());
        System.out.println("BOOK COUNT:");
        System.out.println( student1.getBookCount());
        student1.setBookCount(7);
        System.out.println( student1.getBookCount());
        System.out.println("CLASS COUNT:");
        System.out.println( student1.getClassCount());
        student1.setClassCount(3);
        System.out.println( student1.getClassCount());
        System.out.println("LUNCH MONEY:");
        System.out.println( student1.getLunchMoney());
        student1.setLunchMoney(13.00);
        System.out.println( student1.getLunchMoney());
    }
}
