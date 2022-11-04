package lb3.controller;

import lb3.model.Human;
import lb3.model.Student;

public class StudentCreator {
    public Student createStudent(Human human) {
        Student newStudent = new Student();
        newStudent.setLastName(human.getLastName());
        newStudent.setFatherName(human.getFatherName());
        newStudent.setFirstName(human.getFirstName());
        newStudent.setSex(human.getSex());
        return newStudent;
    }
}
