package lb3.controller;

import lb3.model.*;

import java.util.ArrayList;
import java.util.List;

public class UniversityCreator {
    public University createUniversity(String universityName, Human universityBoss, List<Faculty> faculties) {
        University newUniversity = new University();
        newUniversity.setUniversityName(universityName);
        newUniversity.setUniversityBoss(universityBoss);
        newUniversity.setFaculties(faculties);
        return newUniversity;
    }

    public University createTypicalUniversity() {
        HumanCreator humanCreate = new HumanCreator();
        StudentCreator studentCreate = new StudentCreator();
        GroupCreator groupCreate = new GroupCreator();
        DepartmentCreator departmentCreate = new DepartmentCreator();
        FacultyCreator facultyCreate = new FacultyCreator();
        //group 1
        Human newHuman1 = humanCreate.createHuman("Ivanov", "Igor", "Ivanovych", "Male");
        Human newHuman2 = humanCreate.createHuman("Petrova", "Antonina", "Victorivna", "Female");
        Human newHuman3 = humanCreate.createHuman("Samsonov", "Volodymyr", "Igorovych", "Male");
        Student newStudent1 = studentCreate.createStudent(newHuman1);
        Student newStudent2 = studentCreate.createStudent(newHuman2);
        Student newStudent3 = studentCreate.createStudent(newHuman3);
        Human newBossGroup1 = newHuman2;
        List<Student> newStudents1 = new ArrayList<>();
        newStudents1.add(newStudent1);
        newStudents1.add(newStudent2);
        newStudents1.add(newStudent3);
        Group newGroup1 = groupCreate.createGroup(newStudents1, "124-19-1", newBossGroup1);
        //group 2
        Human newHuman4 = humanCreate.createHuman("Petrov", "Andriy", "Maksymovych", "Male");
        Human newHuman5 = humanCreate.createHuman("Kirilova", "Karyna", "Oleksandrivna", "Female");
        Human newHuman6 = humanCreate.createHuman("Stolovin", "Sergiy", "Ivanovych", "Male");
        Student newStudent4 = studentCreate.createStudent(newHuman4);
        Student newStudent5 = studentCreate.createStudent(newHuman5);
        Student newStudent6 = studentCreate.createStudent(newHuman6);
        Human newBossGroup2 = newHuman6;
        List<Student> newStudents2 = new ArrayList<>();
        newStudents2.add(newStudent4);
        newStudents2.add(newStudent5);
        newStudents2.add(newStudent6);
        Group newGroup2 = groupCreate.createGroup(newStudents2, "124-19-2", newBossGroup2);
        //department 1
        Human newDepartmentBoss1 = humanCreate.createHuman("Polovynkin", "Ivan", "Oleksandrovych", "Male");
        List<Group> newGroups1 = new ArrayList<>();
        newGroups1.add(newGroup1);
        newGroups1.add(newGroup2);
        Department newDepartment1 = departmentCreate.createDepartment(newGroups1, "System analysis", newDepartmentBoss1);
        //faculty 1
        Human newFacultyBoss1 = humanCreate.createHuman("Orlova", "Olena", "Ivanivna", "Female");
        List<Department> newDepartments1 = new ArrayList<>();
        newDepartments1.add(newDepartment1);
        Faculty newFaculty1 = facultyCreate.createFaculty(newDepartments1, "Faculty of informational technologies", newFacultyBoss1);
        //university 1
        Human newUniversityBoss1 = humanCreate.createHuman("Zavgorodniy", "Artem", "Olegovych", "Male");
        List<Faculty> newFaculties1 = new ArrayList<>();
        newFaculties1.add(newFaculty1);
        University newUniversity1 = createUniversity("NTU DP", newUniversityBoss1, newFaculties1);
        return newUniversity1;
    }
}
