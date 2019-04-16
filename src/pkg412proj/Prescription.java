/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg412proj;

/**
 *
 * @author prens
 */
public class Prescription {
   private String prescriptionName;
   private String prescriptionDosage;
   private String prescriptionFrequency;
   
   public Prescription(String prescriptionName, String prescriptionDosage, String prescriptionFrequency){
       this.prescriptionName = prescriptionName;
       this.prescriptionDosage = prescriptionDosage;
       this.prescriptionFrequency = prescriptionFrequency;
   }
   
   public String getPrescriptionName(){
       return this.prescriptionName;
   }
   
   public String getPrescriptionDosage(){
       return this.prescriptionDosage;
   }
   
   public String getPrescriptionFrequency(){
       return this.prescriptionFrequency;
   }
}
