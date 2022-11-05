package lb4.controller;

import lb4.model.Department;
import lb4.model.Faculty;
import lb4.model.Human;

import java.util.List;

public class FacultyCreator {
    public Faculty createFaculty(List<Department> departments, String facultyName, Human facultyBoss) {
        Faculty newFaculty = new Faculty();
        newFaculty.setFacultyName(facultyName);
        newFaculty.setFacultyBoss(facultyBoss);
        newFaculty.setDepartments(departments);
        return newFaculty;
    }
}
