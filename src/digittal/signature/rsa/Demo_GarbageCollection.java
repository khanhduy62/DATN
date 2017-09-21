/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digittal.signature.rsa;

import java.math.BigDecimal;

/**
 *
 * @author hp
 */
public class Demo_GarbageCollection {

    static int number = 10;
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Bye "+number);
    }

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Demo_GarbageCollection abc = new Demo_GarbageCollection();
//        abc= null;
        BigDecimal big = new BigDecimal(Math.PI);
        System.out.println(big);
        System.out.println("Xong! "+number);
        System.gc();
    }
    
}
