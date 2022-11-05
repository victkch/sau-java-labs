package lb4;

import lb4.controller.UniversityCreator;
import lb4.model.University;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class JsonCompareTest {
    @org.junit.Test
    public void jsonTest() throws IOException {
        UniversityCreator universityCreate = new UniversityCreator();
        JsonManager jsonManager = new JsonManager();
        University oldUniversity = universityCreate.createTypicalUniversity();
        String oldUniversityToString = jsonManager.convertObjectToJson(oldUniversity);
        jsonManager.writeTextToFile(oldUniversityToString);
        String oldUniversityString = jsonManager.readTextFromFile();
        University newUniversity = jsonManager.convertJsonToObject(oldUniversityString);
        assertEquals(oldUniversity, newUniversity);
    }
}
