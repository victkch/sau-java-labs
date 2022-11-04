package lb3.controller;

import lb3.model.Human;

public class HumanCreator {
    public Human createHuman(String lastName, String firstName, String fatherName, String sex) {
        Human newHuman = new Human();
        newHuman.setLastName(lastName);
        newHuman.setFirstName(firstName);
        newHuman.setFatherName(fatherName);
        newHuman.setSex(sex);
        return newHuman;
    }
}
