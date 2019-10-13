/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat_8;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author szikra
 * Ko - 0
 * Papir - 1
 * Ollo - 2
 */
public class KoPapirOllo {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        System.out.println("Irjob be az alabbi szavakbol egyet, majd usson ENTER-t: ko, papir, ollo,vege");
        Scanner sc = new Scanner(System.in);
    
        String line = "";
        
        Random random = new Random();
        
        String[] tomb =  {"ko", "papir", "ollo"};
        
        System.out.print("Human: ");
        
        while(!line.equals("vege")){
            line = sc.nextLine();
            int cpuNumber = random.nextInt(3);
            
            String cpuString = tomb[cpuNumber];
            
            System.out.println("Cpu: " + cpuString);
            if (line.equals(cpuString)){
                System.out.println("Dontetlen!");
                continue;
            }
            
            if (line.equals("ko") && cpuString.equals("papir")){
                System.out.println("CPU Nyert!");
                continue;
            }
            
            if (line.equals("ko") && cpuString.equals("ollo")){
                System.out.println("Human Nyert!");
                continue;
            }
            
            if (line.equals("ollo") && cpuString.equals("ko")){
                System.out.println("CPU Nyert!");
                continue;
            }
            
            if (line.equals("ollo") && cpuString.equals("papir")){
                System.out.println("Human Nyert!");
                continue;
            }
            
            if (line.equals("papir") && cpuString.equals("ko")){
                System.out.println("Human Nyert!");
                continue;
            }
            
            if (line.equals("papir") && cpuString.equals("ollo")){
                System.out.println("CPU Nyert!");
                continue;
            }
            System.out.print("Human: ");    
        }
        
        System.out.println(line);
    }
    
    
            

}
