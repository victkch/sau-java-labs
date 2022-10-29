package lb3.controller;

import lb3.model.department;
import lb3.model.faculty;
import lb3.model.human;
import java.util.List;

public class facultyCreator {
    public faculty createFaculty(List<department> departments, String facultyName, human facultyBoss){
        faculty newFaculty=new faculty();
        newFaculty.setFacultyName(facultyName);
        newFaculty.setFacultyBoss(facultyBoss);
        newFaculty.setDepartments(departments);
        return newFaculty;
    }
}
