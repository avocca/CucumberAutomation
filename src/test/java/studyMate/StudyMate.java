package studyMate;

import java.util.ArrayList;
import java.util.List;

public class StudyMate {
    //Data Layer: DB, where we store the information, data
    //Business Logic, Business Layer, API services: methods we create for Presentation Layer team

    //Database setup
    private List<String> groups = new ArrayList<>();

    //Business Layer: APIs
    //User Story 1: As an Admin, I should be able to create a group
    //Requirements: group name CANNOT be empty, and more than 15 letters
    public void createGroup(String groupName){
        if(groupName.isEmpty() || groupName.length() > 15){
            System.out.println("Status: DENIED");
            System.out.println("Message: group name cannot be empty or more than 15 letters");
        }else{
            System.out.println("Status: SUCCESS");
            System.out.println("Group: " + groupName + " is created successfully");
            groups.add(groupName);
        }
    }

    //User Story 2: As an Admin, I should be able to delete a group
    //Requirements: group should be deleted
    public void deleteGroup(String groupName){
        groups.remove(groupName);
        System.out.println("Status: SUCCESS");
        System.out.println("Group: " + groupName + " is deleted successfully");
   }

    //User Story 3: As an Admin, I should be able to edit existing group
    //Requirements: new group name cannot be empty or more than 15 characters
    public void updateGroup(String newGroupName, String existingGroupName){
        if(newGroupName.isEmpty() || newGroupName.length() > 15){
            System.out.println("Status: DENIED \n Invalid new group name: " + newGroupName);
        }else{
            int index = groups.indexOf(existingGroupName);
            groups.remove(existingGroupName);
            groups.add(index, newGroupName);
            System.out.println("Status: SUCCESS");
            System.out.println("Group updated successfully");
        }
    }

    //User Story 4: As an Admin, I should be able to get the List of groups
    //Requirements: display List of groups
    public List<String> getGroups(){
        System.out.println("Status: SUCCESS");
        return groups;
    }












}
