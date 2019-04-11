package pkg412proj;

/**
 *
 * @author prens
 */
public class Payment {
    private String paymentType;
    private String paymentValue;
    
    public Payment(String paymentType, String paymentValue){
        this.paymentType = paymentType;
        this.paymentValue = paymentValue;
    }
    
    public String getPaymentType(){
        return this.paymentType;
    }
    
    public String getPaymentValue(){
        return this.paymentValue;
    }
}
