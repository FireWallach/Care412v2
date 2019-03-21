/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg412proj;

import java.util.ArrayList;
/*
* A class to encapsulate the ArrayList for users. 
*/

public class UserList {
    
    private ArrayList<User> userList; //Encapsulated ArrayList
    private static UserList theUserList;
    
    private UserList(){
        userList = new ArrayList<User>();
        userList.add(new User("admin", "password", 0, "", "", 0));
        userList.add(new User("", "", 0 , "", "", 0));
    }
    
    public static UserList getUserListCntl(){
        if(theUserList != null){
            return theUserList;
        }else{
            theUserList = new UserList();
            return theUserList;
        }
    }

    /**
     * @return the userList
     */
    public ArrayList<User> getUserList() {
        return theUserList.userList;
    }

    /**
     * @param userList the userList to set
     */
    public void setUserList(ArrayList<User> userList) {
        this.userList = userList;
    }
    
    public void add(User user){
        userList.add(user);
    }
    
    public User get(int index){
        return userList.get(index);
    }
    
}
