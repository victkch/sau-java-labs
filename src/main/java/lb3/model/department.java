package lb3.model;

import java.util.List;

public class department {
    private String departmentName;
    private human departmentBoss;
    private List<group> groups;

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    public void setDepartmentBoss(human departmentBoss) {
        this.departmentBoss = departmentBoss;
    }
    public List<group> getGroups() {
        return groups;
    }
    public void setGroups(List<group> groups) {
        this.groups = groups;
    }
    public String toString() {
        return "Department name: "+ departmentName+"\n" +"Department boss:\n "+departmentBoss+
                "\nGroups:\n"+getGroups();
    }
}
