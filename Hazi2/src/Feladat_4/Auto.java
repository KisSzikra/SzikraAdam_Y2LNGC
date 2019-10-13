/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat_4;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Szikra
 */
public class Auto {
    private String rendszam;
    private int motorTelljesitmeny;
    private Date gyartasiDatum = new Date();

    public Auto() {
        this.rendszam = rendszam;
        this.motorTelljesitmeny = motorTelljesitmeny;
    }

    public Auto(String rendszam, int motorTelljesitmeny) {
        this.rendszam = rendszam;
        this.motorTelljesitmeny = motorTelljesitmeny;
    }

    public String getRendszam() {
        return rendszam;
    }

    public int getMotorTelljesitmeny() {
        return motorTelljesitmeny;
    }

    public Date getGyartasiDatum() {
        return gyartasiDatum;
    }

    public void setRendszam(String rendszam) {
        this.rendszam = rendszam;
    }

    @Override
    public String toString() {
        return "Auto{" + "rendszam=" + rendszam + ", motorTelljesitmeny=" + motorTelljesitmeny + ", gyartasiDatum=" + gyartasiDatum + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Auto other = (Auto) obj;
        if (this.motorTelljesitmeny != other.motorTelljesitmeny) {
            return false;
        }
        if (!Objects.equals(this.rendszam, other.rendszam)) {
            return false;
        }
        if (!Objects.equals(this.gyartasiDatum, other.gyartasiDatum)) {
            return false;
        }
        return true;
    }

    
}
