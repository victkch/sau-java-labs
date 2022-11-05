package lb4.controller;

import lb4.model.*;

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
        Student newStudent1 = studentCreate.createStudent(newHuman1);
        Student newStudent2 = studentCreate.createStudent(newHuman2);
        Human newBossGroup1 = newHuman2;
        List<Student> newStudents1 = new ArrayList<>();
        newStudents1.add(newStudent1);
        newStudents1.add(newStudent2);
        Group newGroup1 = groupCreate.createGroup(newStudents1, "124-19-1", newBossGroup1);
        //group 2
        Human newHuman3 = humanCreate.createHuman("Samsonov", "Volodymyr", "Igorovych", "Male");
        Human newHuman4 = humanCreate.createHuman("Petrov", "Andriy", "Maksymovych", "Male");
        Student newStudent3 = studentCreate.createStudent(newHuman3);
        Student newStudent4 = studentCreate.createStudent(newHuman4);
        Human newBossGroup2 = newHuman3;
        List<Student> newStudents2 = new ArrayList<>();
        newStudents2.add(newStudent3);
        newStudents2.add(newStudent4);
        Group newGroup2 = groupCreate.createGroup(newStudents2, "124-19-2", newBossGroup2);
        //group 3
        Human newHuman5 = humanCreate.createHuman("Kirilova", "Karyna", "Oleksandrivna", "Female");
        Human newHuman6 = humanCreate.createHuman("Stolovin", "Sergiy", "Ivanovych", "Male");
        Student newStudent5 = studentCreate.createStudent(newHuman5);
        Student newStudent6 = studentCreate.createStudent(newHuman6);
        Human newBossGroup3 = newHuman5;
        List<Student> newStudents3 = new ArrayList<>();
        newStudents3.add(newStudent5);
        newStudents3.add(newStudent6);
        Group newGroup3 = groupCreate.createGroup(newStudents3, "125-20-1", newBossGroup3);
        //group 4
        Human newHuman7 = humanCreate.createHuman("Ternovyy", "Oleg", "Nazarovych", "Male");
        Human newHuman8 = humanCreate.createHuman("Stolov", "Nazar", "Mykolayovych", "Male");
        Student newStudent7 = studentCreate.createStudent(newHuman7);
        Student newStudent8 = studentCreate.createStudent(newHuman8);
        Human newBossGroup4 = newHuman7;
        List<Student> newStudents4 = new ArrayList<>();
        newStudents4.add(newStudent7);
        newStudents4.add(newStudent8);
        Group newGroup4 = groupCreate.createGroup(newStudents4, "125-21-2", newBossGroup4);
        //group 5
        Human newHuman9 = humanCreate.createHuman("Lampova", "Alina", "Sergiivna", "Female");
        Human newHuman10 = humanCreate.createHuman("Krasnov", "Mykola", "Oleksandrovych", "Male");
        Student newStudent9 = studentCreate.createStudent(newHuman9);
        Student newStudent10 = studentCreate.createStudent(newHuman10);
        Human newBossGroup5 = newHuman10;
        List<Student> newStudents5 = new ArrayList<>();
        newStudents5.add(newStudent9);
        newStudents5.add(newStudent10);
        Group newGroup5 = groupCreate.createGroup(newStudents5, "075-19-1", newBossGroup5);
        //group 6
        Human newHuman11 = humanCreate.createHuman("Ruchkin", "Anton", "Ivanovych", "Male");
        Human newHuman12 = humanCreate.createHuman("Stolovina", "Viktoriia", "Olegivna", "Female");
        Student newStudent11 = studentCreate.createStudent(newHuman11);
        Student newStudent12 = studentCreate.createStudent(newHuman12);
        Human newBossGroup6 = newHuman11;
        List<Student> newStudents6 = new ArrayList<>();
        newStudents6.add(newStudent11);
        newStudents6.add(newStudent12);
        Group newGroup6 = groupCreate.createGroup(newStudents6, "075-19-2", newBossGroup6);
        //group 7
        Human newHuman13 = humanCreate.createHuman("Sonyachna", "Karyna", "Victorivna", "Female");
        Human newHuman14 = humanCreate.createHuman("Anglova", "Anastasiia", "Oleksandrivna", "Female");
        Student newStudent13 = studentCreate.createStudent(newHuman13);
        Student newStudent14 = studentCreate.createStudent(newHuman14);
        Human newBossGroup7 = newHuman13;
        List<Student> newStudents7 = new ArrayList<>();
        newStudents7.add(newStudent13);
        newStudents7.add(newStudent14);
        Group newGroup7 = groupCreate.createGroup(newStudents7, "071-21-1", newBossGroup7);
        //group 8
        Human newHuman15 = humanCreate.createHuman("Samsonova", "Alina", "Mykhalivna", "Female");
        Human newHuman16 = humanCreate.createHuman("Kryvosheyev", "Mykhaylo", "Sergiyovych", "Male");
        Student newStudent15 = studentCreate.createStudent(newHuman15);
        Student newStudent16 = studentCreate.createStudent(newHuman16);
        Human newBossGroup8 = newHuman16;
        List<Student> newStudents8 = new ArrayList<>();
        newStudents8.add(newStudent15);
        newStudents8.add(newStudent16);
        Group newGroup8 = groupCreate.createGroup(newStudents8, "071-19-2", newBossGroup8);
        //department 1
        Human newDepartmentBoss1 = humanCreate.createHuman("Polovynkin", "Ivan", "Oleksandrovych", "Male");
        List<Group> newGroups1 = new ArrayList<>();
        newGroups1.add(newGroup1);
        newGroups1.add(newGroup2);
        Department newDepartment1 = departmentCreate.createDepartment(newGroups1, "System analysis", newDepartmentBoss1);
        //department 2
        Human newDepartmentBoss2 = humanCreate.createHuman("Botolyuk", "Oleksandra", "Viktorivna", "Female");
        List<Group> newGroups2 = new ArrayList<>();
        newGroups2.add(newGroup3);
        newGroups2.add(newGroup4);
        Department newDepartment2 = departmentCreate.createDepartment(newGroups2, "Information security and telecommunications", newDepartmentBoss2);
        //department 3
        Human newDepartmentBoss3 = humanCreate.createHuman("Gryshko", "Vasyl", "Ivanovych", "Male");
        List<Group> newGroups3 = new ArrayList<>();
        newGroups3.add(newGroup5);
        newGroups3.add(newGroup6);
        Department newDepartment3 = departmentCreate.createDepartment(newGroups3, "Marketing", newDepartmentBoss3);
        //department 4
        Human newDepartmentBoss4 = humanCreate.createHuman("Kravchuk", "Oleg", "Pavlovych", "Male");
        List<Group> newGroups4 = new ArrayList<>();
        newGroups4.add(newGroup7);
        newGroups4.add(newGroup8);
        Department newDepartment4 = departmentCreate.createDepartment(newGroups4, "International relations and auditing", newDepartmentBoss4);
        //faculty 1
        Human newFacultyBoss1 = humanCreate.createHuman("Orlova", "Olena", "Ivanivna", "Female");
        List<Department> newDepartments1 = new ArrayList<>();
        newDepartments1.add(newDepartment1);
        newDepartments1.add(newDepartment2);
        Faculty newFaculty1 = facultyCreate.createFaculty(newDepartments1, "Faculty of informational technologies", newFacultyBoss1);
        //faculty 2
        Human newFacultyBoss2 = humanCreate.createHuman("Shepryk", "Antonina", "Semenivna", "Female");
        List<Department> newDepartments2 = new ArrayList<>();
        newDepartments2.add(newDepartment3);
        newDepartments2.add(newDepartment4);
        Faculty newFaculty2 = facultyCreate.createFaculty(newDepartments2, "Faculty of fiance and economics", newFacultyBoss2);
        //university 1
        Human newUniversityBoss1 = humanCreate.createHuman("Zavgorodniy", "Artem", "Olegovych", "Male");
        List<Faculty> newFaculties1 = new ArrayList<>();
        newFaculties1.add(newFaculty1);
        newFaculties1.add(newFaculty2);
        University newUniversity1 = createUniversity("NTU DP", newUniversityBoss1, newFaculties1);
        return newUniversity1;
    }
}
