/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Szikra
 */

import java.util.Date;
import java.util.Objects;

public class Ital {


protected String nev;
protected String kiszereles;
private static int ar = 10;
protected Date gyartasiDatum = new Date();

    
public Ital(String nev, String kiszereles) {
    this.nev = nev;
    this.kiszereles = kiszereles;
}

    public String getNev() {
        return nev;
    }

    public String getKiszereles() {
        return kiszereles;
    }

    public static int getAr() {
        return ar;
    }

    public Date getGyartasiDatum() {
        return gyartasiDatum;
    }

    public static void setAr(int ar) {
        Ital.ar = ar;
    }

    @Override
    public String toString() {
        return nev  + ", " + kiszereles+ ", " + ar + " Ft";
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) { //Reszelni kell!!!
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ital other = (Ital) obj;
        if (!Objects.equals(this.nev, other.nev)) {
            return false;
        }
        if (!Objects.equals(this.kiszereles, other.kiszereles)) {
            return false;
        }
        return true;
    }

    public static double getÁrEuróban(){
        return ar / 330; //2019.09.30. napi arfolyamon 10:14-kor
    }

}
