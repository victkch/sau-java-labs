package lb3.controller;

import lb3.model.Department;
import lb3.model.Group;
import lb3.model.Human;

import java.util.List;

public class DepartmentCreator {
    public Department createDepartment(List<Group> groups, String departmentName, Human departmentBoss) {
        Department newDepartment = new Department();
        newDepartment.setDepartmentName(departmentName);
        newDepartment.setDepartmentBoss(departmentBoss);
        newDepartment.setGroups(groups);
        return newDepartment;
    }
}
