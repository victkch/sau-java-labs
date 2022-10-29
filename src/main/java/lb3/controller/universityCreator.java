package lb3.controller;

import lb3.model.faculty;
import lb3.model.human;
import lb3.model.university;
import java.util.List;

public class universityCreator {
    public university createUniversity(String universityName, human universityBoss, List<faculty> faculties){
        university newUniversity=new university();
        newUniversity.setUniversityName(universityName);
        newUniversity.setUniversityBoss(universityBoss);
        newUniversity.setFaculties(faculties);
        return newUniversity;
    }
}
