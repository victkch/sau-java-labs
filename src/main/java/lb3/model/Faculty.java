package lb3.model;

import java.util.List;

public class Faculty {
    private String facultyName;
    private Human facultyBoss;
    private List<Department> departments;

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public void setFacultyBoss(Human facultyBoss) {
        this.facultyBoss = facultyBoss;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public Human getFacultyBoss() {
        return facultyBoss;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public String toString() {
        return "\nFaculty name: " + facultyName + "\n" + "Faculty boss:" + facultyBoss +
                "\nDepartments:\n" + getDepartments();
    }
}
