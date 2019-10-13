package Fejesek_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author szikra
 
Feladat:
https://progcont.hu/progcont/100124/?pid=200769  
 
Bemenet:
5;Peter;Barnabas
Gabor;Jozsef
Samu;Barnabas
Jozsef;Peter
Barnabas;Gabor
 
Peter Jozsef Gabor Barnabas Samu

10;Peter;Barnabas
Gabor;Jozsef
Samu;Barnabas
Jozsef;Peter
Barnabas;Gabor
Szabolcs;Sanyi
Zsani;Agi
Ditta;Samu
Agi;Ditta
Sanyi;Zsani

Peter Jozsef Gabor Barnabas Samu Ditta Agi Zsani Sanyi Szabolcs

* 
Kimenet:
2 1 
*/

class Adatok{
    String nev;
    String elotte;

    public Adatok(String nev, String elotte) {
        this.nev = nev;
        this.elotte = elotte;
    }

    public String getNev() {
        return nev;
    }

    public String getElotte() {
        return elotte;
    }
    
}

public class Main {
    
    public static void main(String[] args) {
        
        ArrayList<Adatok> list = new ArrayList<Adatok>();
        
        Scanner sc = new Scanner(System.in);        
        
        String line = sc.nextLine();
        
        String[] parts = line.split(";");
         
        int n = Integer.parseInt(parts[0]);
        
        String elsoEmber = parts[1];
        
        String akiNez = parts[2];
        
        String[] tomb = new String[n];
        tomb[0] = elsoEmber;
        
        for(int i=0;i<n-1;i++){
            line = sc.nextLine();
            
            String[] parts2 = line.split(";"); //parts[0] = nev, parts[1] = elotte
            
            list.add(new Adatok(parts2[0], parts2[1]));
        }
        
           
        for (int i = 1; i < tomb.length; i++) {
            for (int j = 0; j < list.size(); j++) {
                if(tomb[i-1].equals(list.get(j).getElotte())){
                    tomb[i] = list.get(j).getNev();
                    break;
                }
            }
        }
        
        int piros = 0;
        int kek = 0;
        int counter = 0;
        
        
        while(!tomb[counter].equals(akiNez)){
            if( (counter % 2) == 0){
                piros++;
            }
            else{
                kek++;
            }
            counter++;
        }

        System.out.println(piros + " " + kek);
        
        }
    }