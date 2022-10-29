package lb3.model;

import java.util.List;

public class university {
    private String universityName;
    private human universityBoss;
    private List<faculty> faculties;

    public human getUniversityBoss() {
        return universityBoss;
    }

    public String getUniversityName() {
        return universityName;
    }
    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }
    public void setUniversityBoss(human universityBoss) {
        this.universityBoss = universityBoss;
    }
    public List<faculty> getFaculties() {
        return faculties;
    }
    public void setFaculties(List<faculty> faculties) {
        this.faculties = faculties;
    }
    public String toString() {
        return "University name: "+ universityName+"\n" +"University boss:\n "+universityBoss+
                "\nFaculties:\n"+getFaculties();
    }
}
