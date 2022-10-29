package lb3.model;

import java.util.List;

public class faculty {
    private String facultyName;
    private human facultyBoss;
    private List<department> departments;

    public String getFacultyName() {
        return facultyName;
    }
    public human getFacultyBoss() {
        return facultyBoss;
    }
    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }
    public void setFacultyBoss(human facultyBoss) {
        this.facultyBoss = facultyBoss;
    }
    public List<department> getDepartments() {
        return departments;
    }
    public void setDepartments(List<department> departments) {
        this.departments = departments;
    }
    public String toString() {
        return "Faculty name: "+ facultyName+"\n" +"Faculty boss:\n "+facultyBoss+
                "\nDepartments:\n"+getDepartments();
    }
}
