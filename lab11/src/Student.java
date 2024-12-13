import java.util.ArrayList;

public class Student {
    private String name;
    private int gpa;
    private ArrayList<Course> courseList = new ArrayList<>();

    public Student(String name, int gpa){
        this.name = name;
        this.gpa = gpa;
    }

    public void addCourse(Course course){
        courseList.add(course);
    }
    public void removeCourse(Course course){
        courseList.remove(course);
    }
    public Course getCourse(String courseName){
        Course foundCourse = null;
        for(Course course: courseList){
            if(course.getCourseName().equals(courseName)){
                foundCourse = course;
                break;
            }
        }
        return foundCourse;
    }
    public <E> void getAllCourses(ArrayList<E> courseList){
        for (E element : courseList){
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    @Override
    public String toString(){
        return String.format("Name: %s\n" + "GPA: %d\n", name, gpa);
    }

    public String getStudentName() {
        return name;
    }
}
