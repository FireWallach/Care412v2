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
 * @author prens
 */
public class PrescriptionList {
    private ArrayList<Prescription> prescriptionList;
    private static PrescriptionList thePrescriptionList; 
    private final int NUM_PRESCRIPTIONS = ThreadLocalRandom.current().nextInt(2, 6);
    private final int DOSAGE_MIN = 10;
    private final int DOSAGE_MAX = 500;
    private final int FREQUENCY_MIN = 1;
    private final int FREQUENCY_MAX = 6;
    
    private PrescriptionList(){
        prescriptionList = new ArrayList<Prescription>();
        for(int i = 0; i < NUM_PRESCRIPTIONS; i++){
            String tempName = "Prescription " + (i + 1);
            int tempDosage = ThreadLocalRandom.current().nextInt(DOSAGE_MIN, DOSAGE_MAX);
            int tempFrequency = ThreadLocalRandom.current().nextInt(FREQUENCY_MIN, FREQUENCY_MAX);;
            String tempDosageString = tempDosage + " mg";
            String tempFrequencyString = tempFrequency + " times daily";
            prescriptionList.add(new Prescription(tempName, tempDosageString, tempFrequencyString));
        }
    }
    
    public static PrescriptionList getPrescriptionListCntl(){
        if(thePrescriptionList != null){
            return thePrescriptionList;
        }else{
            thePrescriptionList = new PrescriptionList();
            return thePrescriptionList;
        }
    }
    
    public ArrayList<Prescription> getPrescriptionList(){
        return thePrescriptionList.prescriptionList;
    }
}
