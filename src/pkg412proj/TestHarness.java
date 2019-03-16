package pkg412proj;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dylanwallach
 */
public class TestHarness {
    
    public static void main(String[] args){
        TestHarness th = new TestHarness();
    }
    
    public TestHarness(){
        this.testGetUserList();
        this.testSetUserList();
        this.testPersonalUIController();
        this.testUserListAdd();
        this.testUserListGet();
        this.testGetUsername();
        this.testSetUsername();
        this.testGetPassword();
        this.testSetPassword();
        this.testGetAge();
        this.testSetAge();
        this.testGetFirstName();
        this.testSetFirstName();
        this.testGetLastName();
        this.testSetLastName();
        this.testGetClearanceLevel();
        this.testSetClearanceLevel();
    }
    
    public void testGetUserList(){
        UserList ul = new UserList();
        if(ul.getUserList().isEmpty()){
            System.out.println("getUserList Passed.");
        } else{
            System.out.println("getUserList Failed.");
        }
    }
    
    public void testUserListAdd(){
        User user = new User("un", "pw", 0, "fname", "lname",0);
        UserList ul = new UserList();
        ul.add(user);
        if(ul.get(0).equals(user)){
            System.out.println("UserList::add Passed.");
        }
    }
    
    public void testUserListGet(){
        User user = new User("getuser", "pw", 0, "fname", "lname",0);
        UserList ul = new UserList();
        ul.add(user);
        if(ul.get(0).equals(user)){
            System.out.println("UserList::get passed.");
        }
    }
    
    
    public void testSetUserList(){
        
        User user = new User("un", "pw", 4, "fname", "lname",0);
        UserList ul = new UserList();
        ul.add(user);
        if(ul.get(0).equals(user)){
            System.out.println("setUserList passed.");
        }
    }
    
    public void testPersonalUIController(){
        PersonalUIController personalUI = new PersonalUIController();
        User testUser = new User("","",0,"","",0);
        
        //testing PersonalUIController.getUser()
        if (personalUI.getUser() == null){
            System.out.println("getUser passed");
        }
        else {
            System.out.println("getUser failed");
        }
        // testing PersonalUIController.setUser()
        personalUI.setUser(testUser); // <-- Temporaily sets the user value to the Test User
        if (personalUI.getUser().equals(personalUI.getUser())){
            System.out.println("setUser passed");
        }
        else {
            System.out.println("setUser failed");
        }
        personalUI.setUser(null); // <-- Returns the value of user to the original value of null
    }
    
    public void testGetUsername(){
        User testUser = new User("un", "pw", 4, "fname", "lname",0);
        if(testUser.getUsername().equals("un")) {
            System.out.println("testGetUsername Passed");
        } else {
            System.out.println("testGetUsername Failed");
        }
    }
    
    public void testSetUsername(){
        User testUser = new User("un", "pw", 4, "fname", "lname",0);
        testUser.setUsername("newUn");
        if(testUser.getUsername().equals("newUn")) {
            System.out.println("testSetUsername Passed");
        } else {
            System.out.println("testSetUsername Failed");
        }
    }
    
    public void testGetPassword(){
        User testUser = new User("un", "pw", 4, "fname", "lname",0);
        if(testUser.getPassword().equals("pw")) {
            System.out.println("testGetPassword Passed");
        } else {
            System.out.println("testGetPassword Failed");
        }
    }
    
    public void testSetPassword(){
        User testUser = new User("un", "pw", 4, "fname", "lname",0);
        testUser.setPassword("newPw");
        if(testUser.getPassword().equals("newPw")) {
            System.out.println("testSetPassword Passed");
        } else {
            System.out.println("testSetPassword Failed");
        }
    }
    
    public void testGetAge(){
        User testUser = new User("un", "pw", 4, "fname", "lname",0);
        if(testUser.getAge() == 4) {
            System.out.println("testGetAge Passed");
        } else {
            System.out.println("testGetAge Failed");
        }
    }
    
    public void testSetAge(){
        User testUser = new User("un", "pw", 4, "fname", "lname",0);
        testUser.setAge(5);
        if(testUser.getAge() == 5) {
            System.out.println("testSetAge Passed");
        } else {
            System.out.println("testSetAge Failed");
        }
    }
    
    public void testGetFirstName(){
        User testUser = new User("un", "pw", 4, "fname", "lname",0);
        if(testUser.getFirstName().equals("fname")) {
            System.out.println("testGetFirstName Passed");
        } else {
            System.out.println("testGetFirstName Failed");
        }
    }
    
    public void testSetFirstName(){
        User testUser = new User("un", "pw", 4, "fname", "lname",0);
        testUser.setFirstName("newfname");
        if(testUser.getFirstName().equals("newfname")) {
            System.out.println("testSetFirstName Passed");
        } else {
            System.out.println("testSetFirstName Failed");
        }
    }
    
    public void testGetLastName(){
        User testUser = new User("un", "pw", 4, "fname", "lname",0);
        if(testUser.getLastName().equals("lname")) {
            System.out.println("testGetLastName Passed");
        } else {
            System.out.println("testGetLastName Failed");
        }
    }
    
    public void testSetLastName(){
        User testUser = new User("un", "pw", 4, "fname", "lname",0);
        testUser.setLastName("newlname");
        if(testUser.getLastName().equals("newlname")) {
            System.out.println("testSetLastName Passed");
        } else {
            System.out.println("testSetLastName Failed");
        }
    }
    
    public void testGetClearanceLevel(){
        User testUser = new User("un", "pw", 4, "fname", "lname",0);
        if(testUser.getClearanceLevel() == 0) {
            System.out.println("testGetClearanceLevel Passed");
        } else {
            System.out.println("testGetClearanceLevel Failed");
        }
    }
    
    public void testSetClearanceLevel(){
        User testUser = new User("un", "pw", 4, "fname", "lname",0);
        testUser.setClearanceLevel(1);
        if(testUser.getClearanceLevel() == 1) {
            System.out.println("testSetClearanceLevel Passed");
        } else {
            System.out.println("testSetClearanceLevel Failed");
        }
    }
    
}