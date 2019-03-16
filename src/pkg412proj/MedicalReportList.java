/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg412proj;

import java.util.ArrayList;

/**
 *
 * @author Dylan
 */
public class MedicalReportList {
    
    //This class is written as a blend of a singleton and a proxy to avoid the need of having to pass it through to every UI Controller as well as protect its integrity. 
    
    private static ArrayList<MedicalReport> list; //Data structure that contains Medical Reports
    
    //Left empty as it's not needed and should not be called externally
    private MedicalReportList(){
        
    }
    
    //Does the standard Singleton initialization
    private static void verifyInitialized(){
        if(list == null)
            list = new ArrayList<>();
    }
    
    //The following methods are masked standard arrayList operations.
    
    public static void add(MedicalReport mr){
        verifyInitialized();
        list.add(mr);
    }
    
    public static MedicalReport get(int o){
        verifyInitialized();
        return list.get(o); 
    }
    
    public static void remove(MedicalReport o){
        verifyInitialized();
        list.remove(o);
    }
    
    public static void remove(int i){
        verifyInitialized();
        list.remove(i);
    }
    
    public static boolean contains(MedicalReport mr){
        verifyInitialized();
        return list.contains(mr);
    }
    
    public static int size(){
        verifyInitialized();
        return list.size();
    }
    
    public static ArrayList<MedicalReport> getList(){
        verifyInitialized();
        return list;
    }
    
}
