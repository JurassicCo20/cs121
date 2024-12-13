import java.util.ArrayList;

public class StudentRecord {
    private ArrayList<Student> studentArrayList = new ArrayList<>();
    public StudentRecord(){
    }
    public void addStudent(Student student){
        studentArrayList.add(student);
    }
    public void removeStudent(Student student){
        studentArrayList.remove(student);
    }
    public Student getPokemon(String studentName){
        Student foundStudent = null;
        for(Student s: studentArrayList){
            if(s.getStudentName().equals(studentName)){
                foundStudent = s;
                break;
            }
        }
        return foundStudent;
    }
    public <E> void getAllStudents(ArrayList<E> studentArrayList){
        for (E element : studentArrayList){
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
}
