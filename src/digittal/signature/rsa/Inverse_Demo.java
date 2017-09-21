/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digittal.signature.rsa;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp
 */
public class Inverse_Demo {

    public int inverse(int p2, int p1, int q2, int n){
        return (p2-p1*q2)%n;
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 15;
        int b = 26;
        int b1 = b;
        int[] step = new int[99];
        int[] so_nguyen = new int[99];
        int index = 0;
        int phan_nguyen = 0, phan_du = 0, gtri = 0;
        Inverse_Demo demo = new Inverse_Demo();
        while (a != 0) {
            phan_nguyen = b/a;
            phan_du = b%a;
            so_nguyen[index] = phan_nguyen;
            if(index < 2){
                gtri = step[index]= index;

            }else{
                int value = demo.inverse(step[index-2], step[index-1], so_nguyen[index-2], b1);
                if (value < 0){
                    value += b1;
                }
                gtri = step[index]= value;
                

            }
            b = a;
            a = phan_du;
            
            index++;
        }
        int value = demo.inverse(step[index-2], step[index-1], so_nguyen[index-2], b1);
                if (value < 0){
                    value += b1;
                }
        System.out.println("Gia tri: "+value);
    }
    
}
