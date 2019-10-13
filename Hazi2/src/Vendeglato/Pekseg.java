package Vendeglato;

import java.util.Arrays;
import java.util.Date;

public class Pekseg extends Vendeglato{
    private String [] pékárú;
//super kulcsszó az osztály szülőosztályára hivatkozik, extends kulcsszóval jelzed 
    public Pekseg(String[] pékárú, String név, String cím) {
        super(név, cím);//ősosztály konstruktorának a meghívása
        this.pékárú = pékárú;
    }

    public String[] getPékárú() {
        return pékárú;
    }

    @Override
    public String toString() {
        return super.toString()+"P\u00e9ks\u00e9g{" + "p\u00e9k\u00e1r\u00fa=" + Arrays.toString(this.pékárú) + '}';
        //aktuális tömbre arrays.tostring kell
    }
    
    
}
