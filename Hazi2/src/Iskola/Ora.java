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
public class Ora {
    public int kod;
    public String nev;
    public int start;

    public Ora() {
    }
    
    public Ora(int kod, String nev, int start) {
        this.kod = kod;
        this.nev = nev;
        if(start < 8 || start > 19){
            this.start = 8;
        }
        else{
            this.start = start;
        }
    }

    public int getKod() {
        return kod;
    }

    public String getNev() {
        return nev;
    }

    public int getStart() {
        return start;
    }

    public void setKod(int kod) {
        this.kod = kod;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setStart(int start) {
        this.start = start;
    }

    @Override
    public String toString() {
        return "Ora{" + "kod=" + kod + ", nev=" + nev + ", start=" + start + '}';
    }
    
}
