/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg412proj;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author dylanwallach
 */
public class MedicalRecord {
    private static MedicalRecord instance;

    private static void initializeInstance() {
        fName = fNames[ThreadLocalRandom.current().nextInt(0,fNames.length)];
        lName = lNames[ThreadLocalRandom.current().nextInt(0,lNames.length)];
        for(int i = 0; i < NODISEASES; i++){
            pastDiseases.add(diseases[ThreadLocalRandom.current().nextInt(0,diseases.length)]);
        }
        for(int i = 0; i < NODOCTORS; i++){
            pastDoctors.add(doctors[ThreadLocalRandom.current().nextInt(0,doctors.length)]);
        }
    }
    private static String fName = "";
    private static String lName = "";
    private static ArrayList<String> pastDiseases = new ArrayList<>();
    private static ArrayList<String> pastDoctors = new ArrayList<>();
    private static String[] fNames = {"Kim", "Carrie", "Dave", "Jonathan", "Michael", "Erin", "Kaitlyn", "James"};
    private static String[] lNames = {"Belaskie", "Logue", "Taff", "Stubbs","Baron"};
    private static String[] diseases = {"Heart Disease", "Stroke", "Respiratory Infection", "Cancer", "Diabetes"};
    private static String[] doctors ={"Dale Earnhardt", "Billy Joel", "Elton John", "Matt Bellamy", "Kelly Shears", "Danielle Tarquinio"};    
    private static final int NODISEASES = ThreadLocalRandom.current().nextInt(1, 4);
    private static final int NODOCTORS = ThreadLocalRandom.current().nextInt(1,4);
    
    private MedicalRecord(){
        
    }
    
    public static MedicalRecord getInstance(){
        if(instance == null){
            instance = new MedicalRecord();
            initializeInstance();
        }
        return instance;
    }

    /**
     * @return the fName
     */
    public String getfName() {
        return fName;
    }

    /**
     * @param fName the fName to set
     */
    public void setfName(String fName) {
        this.fName = fName;
    }

    /**
     * @return the lName
     */
    public String getlName() {
        return lName;
    }

    /**
     * @param lName the lName to set
     */
    public void setlName(String lName) {
        this.lName = lName;
    }

    /**
     * @return the pastDiseases
     */
    public ArrayList<String> getPastDiseases() {
        return pastDiseases;
    }

    /**
     * @param pastDiseases the pastDiseases to set
     */
    public void setPastDiseases(ArrayList<String> pastDiseases) {
        this.pastDiseases = pastDiseases;
    }

    /**
     * @return the pastDoctors
     */
    public ArrayList<String> getPastDoctors() {
        return pastDoctors;
    }

    /**
     * @param pastDoctors the pastDoctors to set
     */
    public void setPastDoctors(ArrayList<String> pastDoctors) {
        this.pastDoctors = pastDoctors;
    }

    /**
     * @return the fNames
     */
    public String[] getfNames() {
        return fNames;
    }

    /**
     * @param fNames the fNames to set
     */
    public void setfNames(String[] fNames) {
        this.fNames = fNames;
    }

    /**
     * @return the lNames
     */
    public String[] getlNames() {
        return lNames;
    }

    /**
     * @param lNames the lNames to set
     */
    public void setlNames(String[] lNames) {
        this.lNames = lNames;
    }

    /**
     * @return the diseases
     */
    public String[] getDiseases() {
        return diseases;
    }

    /**
     * @param diseases the diseases to set
     */
    public void setDiseases(String[] diseases) {
        this.diseases = diseases;
    }

    /**
     * @return the doctors
     */
    public String[] getDoctors() {
        return doctors;
    }

    /**
     * @param doctors the doctors to set
     */
    public void setDoctors(String[] doctors) {
        this.doctors = doctors;
    }

    /**
     * @return the noDiseases
     */
    public int getNoDiseases() {
        return NODISEASES;
    }


    /**
     * @return the noDoctors
     */
    public int getNoDoctors() {
        return NODOCTORS;
    }

}
