package lb3.model;

import java.util.List;

public class group {
    private String groupName;
    private human groupBoss;
    private List<student> students;

    public String getGroupName() {
        return groupName;
    }
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    public human getGroupBoss() {
        return groupBoss;
    }
    public void setGroupBoss(human groupBoss) {
        this.groupBoss = groupBoss;
    }
    public List<student> getStudents() {
        return students;
    }
    public void setStudents(List<student> students) {
        this.students = students;
    }
    public String toString() {
        return "\nGroup name: "+ groupName+"\n" +"Group boss:\n "+getGroupBoss()+"\nStudents:\n"+getStudents();
    }
}
