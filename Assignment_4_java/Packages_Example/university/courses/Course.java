package university.courses;

public class Course {
    private String courseName;
    private String courseCode;
    private int credits;

    public Course(String courseName, String courseCode, int credits) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.credits = credits;
    }

    // Getters
    public String getCourseName() {
        return courseName;
    }
    public String getCourseCode() {
        return courseCode;
    }
    public int getCredits() {
        return credits;
    }

    // Setters
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "Course [courseName=" + courseName + ", courseCode=" + courseCode + ", credits=" + credits + "]";
    }
}
