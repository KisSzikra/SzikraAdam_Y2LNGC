package Feladat_3;

import java.util.Arrays;

/**
 *
 * @author Szikra
 */
public class Etterem extends VendeglatoipariEgyseg{
    public String[] etlap;

    public Etterem(String nev, int ferohelyekSzama, boolean dohanyzo,String[] etlap) {
        super(nev, ferohelyekSzama, false);
        this.etlap = etlap;
    }

    public String[] getEtlap() {
        return etlap;
    }

    @Override
    public String toString() {
        return super.toString() + "Etterem{" + "etlap=" + Arrays.toString(etlap) + '}';
    }
    
    
}
