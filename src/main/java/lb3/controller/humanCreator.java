package lb3.controller;

import lb3.model.human;

public class humanCreator {
    public human createHuman(String lastName,String firstName,String fatherName,String sex){
        human newHuman=new human();
        newHuman.setLastName(lastName);
        newHuman.setFirstName(firstName);
        newHuman.setFatherName(fatherName);
        newHuman.setSex(sex);
        return newHuman;
    }
}
