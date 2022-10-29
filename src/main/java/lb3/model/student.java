package lb3.model;

public class student {
    private human humanStudent;

    public human getHumanStudent() {
        return humanStudent;
    }
    public void setHumanStudent(human humanStudent) {
        this.humanStudent = humanStudent;
    }
    public String toString() {
        return "\nStudent:\n " + getHumanStudent();
    }
}
