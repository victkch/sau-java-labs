package lb4.controller;

import lb4.model.Human;
import lb4.model.Student;

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
