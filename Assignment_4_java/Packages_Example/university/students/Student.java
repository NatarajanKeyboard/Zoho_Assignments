package university.students;

public class Student {

    private String name;
    private String studentId;
    private String courseEnrolled;

    public Student(String name, String studentId, String courseEnrolled) {
        this.name = name;
        this.studentId = studentId;
        this.courseEnrolled = courseEnrolled;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getCourseEnrolled() {
        return courseEnrolled;
    }

    public void setCourseEnrolled(String courseEnrolled) {
        this.courseEnrolled = courseEnrolled;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", studentId=" + studentId + ", courseEnrolled=" + courseEnrolled + "]";
    }
}

