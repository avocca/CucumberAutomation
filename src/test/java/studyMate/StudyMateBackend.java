package studyMate;

import java.util.ArrayList;
import java.util.List;

public class StudyMateBackend {
    private List<Group> groups = new ArrayList<>();
    private List<Student> students = new ArrayList<>();

    //CRUD for group

    //POST
    //ENDPOINT => URL
    //Create
    public void createGroup(Group group){
        if(group.groupName.isEmpty()){
            System.out.println("Status: Denied");
            System.out.println("Group name cannot be empty");
        }else{
            System.out.println("Status: Success");
            System.out.println("Group is created");
            groups.add(group);
        }
    }

    //GET
    //Ready (Get)
    public List<Group> getGroups(){
        System.out.println("Status: Success");
        return groups;
    }

    //Update
    public void updateGroup(Group existingGroup, Group newGroup){
        int index = groups.indexOf(existingGroup);
        groups.remove(existingGroup);
        groups.add(index, newGroup);
        System.out.println("Status: Success");
        System.out.println("Group is updated");
    }

    //Delete
    public void deleteGroup(Group group){
        groups.remove(group);
        System.out.println("Status: Success");
        System.out.println("Group deleted");
    }


















}
