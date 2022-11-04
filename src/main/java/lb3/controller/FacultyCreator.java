package lb3.controller;

import lb3.model.Department;
import lb3.model.Faculty;
import lb3.model.Human;

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
