import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;
    private int gpa;
    private Map<String,Course> courseList = new HashMap<>();

    public Student(String name, int gpa){
        this.name = name;
        this.gpa = gpa;
    }

    public void addCourse(String courseName, Course course){
        courseList.put(courseName, course);
    }
    public void removeCourse(String courseName){
        courseList.remove(courseName);
    }
    public String getCourse(String courseName){
        String foundCourse = null;
        if(courseList.containsKey(courseName)){
                foundCourse = String.valueOf(courseList.get(courseName));
        }
        return foundCourse;
    }
    public StringBuilder getAllCourses(){
        StringBuilder allCourses = new StringBuilder();
        courseList.forEach( (courseName, course) -> {
            allCourses.append( String.format("Course Name: %s | Course: %s\n", courseName, course));
        });
        return allCourses;
    }

    @Override
    public String toString(){
        return String.format("Name: %s\n" + "GPA: %d\n", name, gpa);
    }

    public String getStudentName() {
        return name;
    }
}
