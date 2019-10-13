/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AngolMagyarSzotar2;

import java.util.*;

/**
 *
 * @author Szikra
 Feladat:
 https://progcont.hu/progcont/100190/?pid=201009
  
Bemenet:
5
take:visz
dove:galamb
take:vesz
pigeon:galamb
take:fog 

Kimenet:
dove:galamb
pigeon:galamb
take:fog
take:vesz
take:visz
*/

class Adatok{
    String angol;
    String magyar;

    public Adatok(String angol, String magyar) {
        this.angol = angol;
        this.magyar = magyar;
    }

    public String getAngol() {
        return angol;
    }

    public String getMagyar() {
        return magyar;
    }
    
    
    
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String line = sc.nextLine();
        
        int n = Integer.parseInt(line);
        
        ArrayList<Adatok> list = new ArrayList<Adatok>();
        
        for(int i=0;i<n;i++){
            line = sc.nextLine();
            
            String[] parts = line.split(":");
            
            list.add(new Adatok(parts[0], parts[1]));
            
        }
        
        Collections.sort(list, Comparator.comparing(Adatok::getAngol).thenComparing(Adatok::getMagyar));
        
        for(Adatok adatok : list){
            System.out.println(adatok.getAngol() + ":" + adatok.getMagyar());
        }
        
    }
    
}
