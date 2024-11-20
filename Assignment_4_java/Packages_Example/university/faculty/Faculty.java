package university.faculty;

public class Faculty {
    private String name;
    private String facultyId;
    private String department;

    public Faculty(String name, String facultyId, String department) {
        this.name = name;
        this.facultyId = facultyId;
        this.department = department;
    }

    // Getters
    public String getName() {
        return name;
    }
    public String getFacultyId() {
        return facultyId;
    }
    public String getDepartment() {
        return department;
    }

    // Setters...
    public void setName(String name) {
        this.name = name;
    }
    public void setFacultyId(String facultyId) {
        this.facultyId = facultyId;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Faculty [name=" + name + ", facultyId=" + facultyId + ", department=" + department + "]";
    }
}
