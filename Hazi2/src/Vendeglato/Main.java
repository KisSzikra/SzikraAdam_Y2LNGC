package Vendeglato;

import java.util.*;

public class Main {
//egy projekt tobb package zh-n
//instanceof mit tud? 
   
    private static Pekseg[] adottPékárú(String péksüti, Vendeglato[] ve){
        int k=0;
        for (int i = 0; i < ve.length; i++) {
            if(ve[i] instanceof Pekseg){
                //System.out.print(i + " ");
                Pekseg p = (Pekseg) ve[i]; //kasztolás
                
                for (int j = 0; j < p.getPékárú().length; j++) {
                    if(p.getPékárú()[j].equals(péksüti))
                        k++;
                    break;
                }
            }
        }
        
        //System.out.println("k:" + k);
        
        Pekseg[] pékség = new Pekseg[k];
        
        k=0;
        
        for (int i = 0; i < ve.length; i++) {
            if(ve[i] instanceof Pekseg){
                Pekseg p=(Pekseg)ve[i]; //kasztolás
                
                for (int j = 0; j < p.getPékárú().length; j++) {
                    if(p.getPékárú()[j].equals(péksüti))
                        pékség[k]=p;
                        k++;
                    break;
                }
            }
         }    
    return pékség;
    }
    
   public static void main(String[] args) {
    
    Vendeglato[] v=new Vendeglato[]{
    new Kocsma(new String[]{"Kent","ASD","MonteCarlo"},"Nemzeti1","Egyetem_ter1"),
    new Kocsma(new String[]{"Kent","ASD","MonteCarlo"},"Nemzeti1","Egyetem_ter1"),
    new Kocsma(new String[]{"Kent","ASD","MonteCarlo"},"Nemzeti1","Egyetem_ter1"),
    new Kocsma(new String[]{"Kent","ASD","MonteCarlo"},"Nemzeti1","Egyetem_ter1"),
    new Kocsma(new String[]{"Kent","ASD","MonteCarlo"},"Nemzeti1","Egyetem_ter1"),
    new Pekseg(new String[] {"Kifli","Zsömle","Kenyer"},"Aranycipo","Egyetem ter1"),
    new Pekseg(new String[] {"Kifli","Zsömle","Kenyer"},"Aranycipo","Egyetem ter1"),
    new Pekseg(new String[] {"Kifli","Zsömle","Kenyer"},"Aranycipo","Egyetem ter1"),
    new Pekseg(new String[] {"Kifli","Zsömle","Kenyer"},"Aranycipo","Egyetem ter1"),
    new Pekseg(new String[] {"Kifli","Zsömle","Kenyer"},"Aranycipo","Egyetem ter1"),
    new Pekseg(new String[] {"Kifli","Zsömle","Kenyer"},"Aranycipo","Egyetem ter1")     
    };
    
    Pekseg[] pk = adottPékárú("Kifli",v);
    System.out.println(Arrays.toString(pk));
       
}

}
