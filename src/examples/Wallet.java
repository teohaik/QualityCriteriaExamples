
package examples;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Bad cohesion example!
 * 
 * @author chaikalis
 * 
 */
public class Wallet {
    
    private double balance;
    
    private List<String> phoneNumbers;
    
    public Wallet(double initialBalance){
        balance = initialBalance;
        phoneNumbers = new ArrayList<>();
    }
    
    public boolean sufficientBalance(double amount){
        if (balance >= amount) return true;
        return false;
    }
    
    public void payAnAmount(double amount){
        System.out.println("request to pay "+amount);
        if(balance >= amount){
            balance = balance - amount;
        }
        System.out.println("new balance = "+balance);
    }    
    
    
    public void addPhoneNumber(String aNumber){
        phoneNumbers.add(aNumber);
    }
    
    public void printPhoneNumbers(){
        for(String s: phoneNumbers){
            System.out.println(s);
        }
    }
    
}
