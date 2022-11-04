package lb3.model;

import java.util.List;

public class Department {
    private String departmentName;
    private Human departmentBoss;
    private List<Group> groups;

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setDepartmentBoss(Human departmentBoss) {
        this.departmentBoss = departmentBoss;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public String toString() {
        return "\nDepartment name: " + departmentName + "\n" + "Department boss:" + departmentBoss +
                "\nGroups:\n" + getGroups();
    }
}
