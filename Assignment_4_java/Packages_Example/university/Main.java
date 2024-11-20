package university;

import university.students.Student;
import university.courses.Course;
import university.faculty.Faculty;

public class Main {
    public static void main(String[] args) {
        // Create a new student
        Student student1 = new Student("John Doe", "S001", "CS101");
        System.out.println(student1);

        // Create a new course
        Course course1 = new Course("Computer Science", "CS101", 3);
        System.out.println(course1);

        // Create a new faculty member
        Faculty faculty1 = new Faculty("Dr. Smith", "F001", "Computer Science");
        System.out.println(faculty1);

        // Change course enrollment for the student
        student1.setCourseEnrolled("CS102");
        System.out.println("After changing course:");
        System.out.println(student1);
    }
}
