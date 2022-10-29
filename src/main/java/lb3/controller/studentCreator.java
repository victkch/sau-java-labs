package lb3.controller;

import lb3.model.human;
import lb3.model.student;

public class studentCreator {
    public student createStudent(human humanStudent){
        student newStudent=new student();
        newStudent.setHumanStudent(humanStudent);
        return newStudent;
    }
}
