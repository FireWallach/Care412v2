/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg412proj;

/**
 *
 * @author Dylan
 */
public class User {
    private String username; //username of the user
    private String password; //password of the user
    private Integer age; //age of the user
    private String firstName; //Legal first name of the user
    private String lastName; //Legal Last name of the user
    //Clearance: patient=0, doctor=1, admin=2
    private Integer clearanceLevel; //describes what information the logged in user has access to. 
    
    /**
     *
     * @param username
     * @param password
     */
    public User(String username, String password, int age, String firstName, String lastName, int clearanceLevel){
        this.username = username;
        this.password = password;
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.clearanceLevel = clearanceLevel;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the clearenceLevel
     */
    public Integer getClearanceLevel() {
        return clearanceLevel;
    }

    /**
     * @param clearenceLevel the clearenceLevel to set
     */
    public void setClearanceLevel(Integer clearanceLevel) {
        this.clearanceLevel = clearanceLevel;
    }
}
