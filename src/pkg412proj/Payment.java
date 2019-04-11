package pkg412proj;

/**
 *
 * @author prens
 */
public class Payment {
    private String paymentType;
    private double paymentValue;
    
    public Payment(String paymentType, double paymentValue){
        this.paymentType = paymentType;
        this.paymentValue = paymentValue;
    }
    
    public String getPaymentType(){
        return this.paymentType;
    }
    
    public double getPaymentValue(){
        return this.paymentValue;
    }
}
