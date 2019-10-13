package Feladat_3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author szikra
 */
public class Test {
    
    public static Kocsma[] adottItaltKinaloKocsmak(String ital, VendeglatoipariEgyseg[] vendegEgyseg){
        int counter = 0;
        for (int i = 0; i < vendegEgyseg.length; i++) {
            if(vendegEgyseg[i] instanceof Kocsma){
                Kocsma kocsma = (Kocsma) vendegEgyseg[i];
                
                for (int j = 0; j < kocsma.getSorlap().length; j++) {
                    if(kocsma.getSorlap()[j].equals(ital)){
                        counter++;
                        break;
                    }
                }
            }
        }
        
        Kocsma[] kocsma = new Kocsma[counter];
        counter = 0;
        
        for (int i = 0; i < vendegEgyseg.length; i++) {
            if(vendegEgyseg[i] instanceof Kocsma){
                Kocsma tmpKocsma = (Kocsma) vendegEgyseg[i];
                
                for (int j = 0; j < tmpKocsma.getSorlap().length; j++) {
                    if (tmpKocsma.getSorlap()[j].equals(ital)) {
                        kocsma[counter] = tmpKocsma;
                        counter++;
                        break;
                    }
                }
            }
        }

        return kocsma;
    }
    
    public static void main(String[] args) {
        VendeglatoipariEgyseg[] vendeglatoArray = new VendeglatoipariEgyseg[10];
        
        vendeglatoArray[0] = new Etterem("Fanny Falatozo", 10, true, new String[] {"hamburger", "pizza", "salata", "gyros"});
        vendeglatoArray[1] = new Etterem("Bob Burger Falodaja", 12, false, new String[] {"hamburger", "pizza", "salata", "gyros"} );
        vendeglatoArray[2] = new Etterem("Hakap Eszik", 8, true, new String[] {"hamburger", "pizza", "salata", "gyros"} );
        vendeglatoArray[3] = new Etterem("McDogle's", 12, false, new String[] {"hamburger", "pizza", "salata", "gyros"} );
        vendeglatoArray[4] = new Etterem("Himi humi & nyimi nyami", 12, true, new String[] {"hamburger", "pizza", "salata", "gyros"} );
        
        vendeglatoArray[5] = new Kocsma("Dreher", 10, false, new String[] {"heineken", "dreher", "kobambi", "stefl"});
        vendeglatoArray[6] = new Kocsma("Piccolo", 12, true, new String[] {"heineken", "dreher", "kobambi", "stefl"} );
        vendeglatoArray[7] = new Kocsma("Hosszu lepes", 8, false, new String[] {"heineken", "dreher", "kobambi", "stefl"});
        vendeglatoArray[8] = new Kocsma("Rovid elet", 12, true, new String[] {"heineken", "dreher", "kobambi", "stefl"} );
        vendeglatoArray[9] = new Kocsma("Kerge Sas", 12, false, new String[] {"heineken", "dreher", "kobambi", "stefl"} );

        Kocsma[] kocsma = adottItaltKinaloKocsmak("heineken",vendeglatoArray);
        System.out.println(Arrays.toString(kocsma));
        
      
    }
    
}
