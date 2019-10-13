package Vendeglato;

import java.util.Date;
import java.util.Objects;

public class Vendeglato {
 String név;
 String cím;
 Date nyitás;

    public Vendeglato(String név, String cím) {
        this.név = név;
        this.cím = cím;
        //this.nyitás = new Date();
    }

    public String getNév() {
        return név;
    }

    public String getCím() {
        return cím;
    }

    public Date getNyitás() {
        return nyitás;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public void setCím(String cím) {
        this.cím = cím;
    }

    public void setNyitás(Date nyitás) {
        this.nyitás = nyitás;
    }

    @Override
    public String toString() {
        return "Vend\u00e9gl\u00e1t\u00f3{" + "n\u00e9v=" + név + ", c\u00edm=" + cím + ", nyit\u00e1s=" + nyitás + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }
//tudni kell írni papíron equals metodust
    @Override
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof Vendeglato))
            return false;
        Vendeglato v=(Vendeglato)obj;
        return v.getCím().equals(this.cím) && v.getNév().equals(this.név);
    }   

}
