package Feladat_3;

import java.util.*;

/**
 *
 * @author Szikra
 */
public class Kocsma extends VendeglatoipariEgyseg{
    public String[] sorlap;

    public Kocsma() {
    }

    public Kocsma(String nev, int ferohelyekSzama, boolean dohanyzo,String[] sorlap) {
        super(nev, ferohelyekSzama, true);
        this.sorlap = sorlap;
    }

    public String[] getSorlap() {
        return sorlap;
    }

    @Override
    public String toString() {
        return super.toString() + "Kocsma{" + "sorlap=" + Arrays.toString(sorlap) + '}';
    }

    
    
    
    
}
