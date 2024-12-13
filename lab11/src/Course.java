public class Course {
    private String courseName;
    private String courseProf;
    private int courseLimit;

    public Course(String courseName, String courseProf, int courseLimit){
        this.courseName = courseName;
        this.courseProf = courseProf;
        this.courseLimit = courseLimit;
    }

    @Override
    public String toString(){
        return String.format("Course Name: %s\n" + "Course Professor: %s\n" + "Course Max Capacity: %d\n", courseName, courseProf, courseLimit);
    }

    public String getCourseName() {
        return courseName;
    }
}
