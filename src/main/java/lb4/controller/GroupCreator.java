package lb4.controller;

import lb4.model.Group;
import lb4.model.Human;
import lb4.model.Student;

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
