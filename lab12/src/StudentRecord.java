import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StudentRecord {
    private Map<Integer,Student> studentList = new HashMap<>();
    public StudentRecord(){
    }
    public void addStudent(int stuID, Student student){
        studentList.put(stuID, student);
    }
    public void removeStudent(int id){
        studentList.remove(id);
    }
    public Integer getStudent(int stuid){
        Integer foundStudent = null;
        if(studentList.containsKey(stuid)){
                foundStudent = Integer.valueOf(String.valueOf(studentList.get(stuid)));
        }
        return foundStudent;
    }
    public StringBuilder getAllStudents(){
        StringBuilder allStudents = new StringBuilder();
        studentList.forEach( (studentId, student) -> {
            allStudents.append( String.format("Student ID: %d | Student: %s\n", studentId, student));
        });
        return allStudents;
    }
}
