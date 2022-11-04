package lb3;

import lb3.controller.*;

public class Run {
    public static void main(String[] args) {
        UniversityCreator universityCreate = new UniversityCreator();
        System.out.println(universityCreate.createTypicalUniversity());
    }
}
