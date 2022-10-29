package lb3.controller;

import lb3.model.group;
import lb3.model.human;
import lb3.model.student;
import java.util.List;

public class groupCreator {
    public group createGroup(List<student> students,String groupName,human groupBoss){
        group newGroup=new group();
        newGroup.setGroupName(groupName);
        newGroup.setGroupBoss(groupBoss);
        newGroup.setStudents(students);
        return newGroup;
    }
}
