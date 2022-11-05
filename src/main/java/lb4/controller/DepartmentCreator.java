package lb4.controller;

import lb4.model.Department;
import lb4.model.Group;
import lb4.model.Human;

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
