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
public class MedicalReport {
    private String user;     //The user the report is on
    private String test; //Describes what's being tested for
    private String result;   //Says what the result is
    private String doctor; //Describes the doctor who entered the report
    private String room; //Describes the room where the report was conducted
    
    public MedicalReport(String user, String testType, String result, String doctor, String room){
        this.user = user;
        this.test = testType;
        this.result = result;
        this.doctor = doctor;
        this.room = room;
    }

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the testType
     */
    public String getTestType() {
        return test;
    }

    /**
     * @param testType the testType to set
     */
    public void setTestType(String testType) {
        this.test = testType;
    }

    /**
     * @return the result
     */
    public String getResult() {
        return result;
    }

    /**
     * @param result the result to set
     */
    public void setResult(String result) {
        this.result = result;
    }
    
    /**
     * @return the doctor
     */
    public String getDoctor(){
        return doctor;
    }
    
    /**
     * @param doctor the doctor to set
     */
    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }
    
    /**
     * @return the room
     */
    public String getRoom(){
        return room;
    }
    
    /**
     * @param room the room to set
     */
    public void setRoom(String room) {
        this.room = room;
    }
            
}
