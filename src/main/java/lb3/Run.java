package lb3;

import lb3.controller.*;
import lb3.model.*;
import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
       System.out.println(createTypicalUniversity());
    }
    public static university createTypicalUniversity(){
        humanCreator humanCreate=new humanCreator();
        studentCreator studentCreate=new studentCreator();
        groupCreator groupCreate=new groupCreator();
        departmentCreator departmentCreate=new departmentCreator();
        facultyCreator facultyCreate=new facultyCreator();
        universityCreator universityCreate=new universityCreator();
        //group 1
        human newHuman1=humanCreate.createHuman("Ivanov","Igor","Sergeevich","Male");
        human newHuman2=humanCreate.createHuman("Petrova","Antonina","Victorovna","Female");
        human newHuman3=humanCreate.createHuman("Samsonov","Vladimir","Igorovich","Male");
        student newStudent1=studentCreate.createStudent(newHuman1);
        student newStudent2=studentCreate.createStudent(newHuman2);
        student newStudent3=studentCreate.createStudent(newHuman3);
        human newBossGroup1=newHuman2;
        List<student> newStudents1=new ArrayList<>();
        newStudents1.add(newStudent1);
        newStudents1.add(newStudent2);
        newStudents1.add(newStudent3);
        group newGroup1=groupCreate.createGroup(newStudents1,"124-19-1",newBossGroup1);
        //group 2
        human newHuman4=humanCreate.createHuman("Petrov","Andrew","Maksimovich","Male");
        human newHuman5=humanCreate.createHuman("Kirilova","Karina","Sergeevna","Female");
        human newHuman6=humanCreate.createHuman("Stolovin","Sergey","Ivanovich","Male");
        student newStudent4=studentCreate.createStudent(newHuman4);
        student newStudent5=studentCreate.createStudent(newHuman5);
        student newStudent6=studentCreate.createStudent(newHuman6);
        human newBossGroup2=newHuman6;
        List<student> newStudents2=new ArrayList<>();
        newStudents2.add(newStudent4);
        newStudents2.add(newStudent5);
        newStudents2.add(newStudent6);
        group newGroup2=groupCreate.createGroup(newStudents2,"124-19-2",newBossGroup2);
        //department 1
        human newDepartmentHuman1=humanCreate.createHuman("Polovinkin","Ivan","Aleksandrovich","Male");
        List<group> newGroups1=new ArrayList<>();
        newGroups1.add(newGroup1);
        newGroups1.add(newGroup2);
        department newDepartment1=departmentCreate.createDepartment(newGroups1,"System analysis",newDepartmentHuman1);
        //faculty 1
        human newFacultyHuman1=humanCreate.createHuman("Orlova","Anna","Ivanovna","Female");
        List<department> newDepartments1=new ArrayList<>();
        newDepartments1.add(newDepartment1);
        faculty newFaculty1=facultyCreate.createFaculty(newDepartments1,"Faculty of informational technologies",newFacultyHuman1);
        //university 1
        human newUniversityHuman1=humanCreate.createHuman("Zavgorodniy","Artem","Olegovich","Male");
        List<faculty> newFaculties1=new ArrayList<>();
        newFaculties1.add(newFaculty1);
        university newUniversity1=universityCreate.createUniversity("NTU DP",newUniversityHuman1,newFaculties1);
        return newUniversity1;
    }
}
