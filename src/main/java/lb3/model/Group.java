package lb3.model;

import java.util.List;

public class Group {
    private String groupName;
    private Human groupBoss;
    private List<Student> students;

    public String getGroupName() {
        return groupName;
    }

    public Human getGroupBoss() {
        return groupBoss;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setGroupBoss(Human groupBoss) {
        this.groupBoss = groupBoss;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String toString() {
        return "\nGroup name: " + groupName + "\n" + "Group boss:" + getGroupBoss() + "\nStudents:\n" + getStudents();
    }
}
