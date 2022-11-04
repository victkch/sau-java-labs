package lb3.controller;

import lb3.model.Group;
import lb3.model.Human;
import lb3.model.Student;

import java.util.List;

public class GroupCreator {
    public Group createGroup(List<Student> students, String groupName, Human groupBoss) {
        Group newGroup = new Group();
        newGroup.setGroupName(groupName);
        newGroup.setGroupBoss(groupBoss);
        newGroup.setStudents(students);
        return newGroup;
    }
}
