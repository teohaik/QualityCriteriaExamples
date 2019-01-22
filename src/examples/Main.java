/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

/**
 *
 * @author chaikal
 */
public class Main {
    
    public static void main(String args[]){
        Wallet w = new Wallet(100);
        
        w.addPhoneNumber("1321564");
        w.payAnAmount(50);
        w.addPhoneNumber("2544485");
        w.payAnAmount(20);
        
        w.printPhoneNumbers();
    }
    
}
