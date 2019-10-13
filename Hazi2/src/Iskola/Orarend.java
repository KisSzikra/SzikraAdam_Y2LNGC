/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iskola;

/**
 *
 * @author szikra
 */
public class Orarend {
    
    String nap;
    Ora[] tomb;
    int counter;
    
    String[] napNeve = {"hetfo", "kedd", "szerda", "csutortok", "pentek"};
    
    public static boolean oratHozzaad(Ora ora){
        if (true){
            
        }
    return false;
    }

    public Orarend(String nap) {
        this.nap = nap;
        counter = 0;
        Ora[] tomb = new Ora[12];
    }

    public String getNap() {
        return nap;
    }

    public Ora[] getTomb() {
        return tomb;
    }

    public int getCounter() {
        return counter;
    }

    public void setNap(String nap) {
        this.nap = nap;
    }

    public void setTomb(Ora[] tomb) {
        this.tomb = tomb;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
