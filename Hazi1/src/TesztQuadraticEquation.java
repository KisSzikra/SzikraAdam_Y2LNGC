/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Szikra
 */
public class TesztQuadraticEquation {
    public static void main(String[] args) {
        QuadraticEquation t1 = new QuadraticEquation(2, 10, 12);
        QuadraticEquation t2 = new QuadraticEquation(41, 246, 369);
        QuadraticEquation t3 = new QuadraticEquation(3, 4, 560);
              
        
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        
        /*
        for(int a = 0;a<1000;a++){
         for(int b = 0;b<1000;b++){
            for(int c = 0;c<1000;c++){
            //(b * b) - (4*a*c);
            if (((b * b) - (4*a*c)) < 0){
                System.out.println(a + " " + b + " "+ c);
            }
        }
        }   
        }
        */
        
        
    }
    
}
