
package pkg412proj;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author prens
 */
public class PaymentList {
    
    private ArrayList<Payment> paymentList; //Encapsulated ArrayList
    private static PaymentList thePaymentList;
    private final String[] paymentTypes = {"ER Visit", "Primary Care", "Prescription", "Long Term Care"};
    private final double PAYMENT_MIN = 100;
    private final double PAYMENT_MAX = 100000;
    private final int NUM_PAYMENTS = ThreadLocalRandom.current().nextInt(2, 6);
    
    
    private PaymentList(){
        paymentList = new ArrayList<Payment>();
        for(int i = 0; i < NUM_PAYMENTS; i++){
            int tempType = ThreadLocalRandom.current().nextInt(0, paymentTypes.length);
            double tempValue = Math.round(ThreadLocalRandom.current().nextDouble(PAYMENT_MIN, PAYMENT_MAX)*100.0)/100.0;
            String tempValueString = "$" + Double.toString(tempValue);
            paymentList.add(new Payment(paymentTypes[tempType], tempValueString));
        }
    }
    
    public static PaymentList getPaymentListCntl(){
        if(thePaymentList != null){
            return thePaymentList;
        }else{
            thePaymentList = new PaymentList();
            return thePaymentList;
        }
    }
    
    /**
     * @return the paymentList
     */
    public ArrayList<Payment> getPaymentList() {
        return thePaymentList.paymentList;
    }
    
}
