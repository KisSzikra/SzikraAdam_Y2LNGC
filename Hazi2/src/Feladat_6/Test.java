/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat_6;

import java.util.Random;

/**
 *
 * @author szikra
 */
public class Test {
    
    public static boolean isConsecutiveFour(int[] values){
        if (values.length <4) return false;
        else{
            int counter = 0;
            for(int i=0;i<values.length-1;i++){
                if(values[i] == values[i+1]){
                    counter += 1;
                }
                else{
                    counter = 0;
                }
                
                if (counter == 3){
                    return true;
                }
            }
            
        }
        return false;
    }
    
    public static void main(String[] args) {
        
        Random rnd = new Random();
    
        int[] t = new int[100]; //100-at at lehet irni masra
        int[] t2 = new int[] {4,2,5,7,1,1,1,1,2,6,3,2};        
        
        for (int i = 0; i < t.length; i++) {
            t[i] = rnd.nextInt(10);
            //System.out.print(t[i] + " ");
        }
        
        System.out.println(isConsecutiveFour(t));
        System.out.println(isConsecutiveFour(t2));
        
    }
}
