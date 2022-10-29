package lb3.controller;

import lb3.model.department;
import lb3.model.group;
import lb3.model.human;
import java.util.List;

public class departmentCreator {
    public department createDepartment(List<group> groups, String departmentName, human departmentBoss){
        department newDepartment=new department();
        newDepartment.setDepartmentName(departmentName);
        newDepartment.setDepartmentBoss(departmentBoss);
        newDepartment.setGroups(groups);
        return newDepartment;
    }
}
