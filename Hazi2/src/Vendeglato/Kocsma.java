package Vendeglato;

import java.util.Arrays;
import java.util.Date;
import java.util.Objects;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author monus
 */
public class Kocsma extends Vendeglato{
    String[] cigaretta;

    public Kocsma(String[] cigaretta, String név, String cím) {
        super(név, cím);
        this.cigaretta = cigaretta;
    }

    
    
    public String[] getCigaretta() {
        return cigaretta;
    }

    public void setCigaretta(String[] cigaretta) {
        this.cigaretta = cigaretta;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override//ilyen lesz a zh-
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof Kocsma)){
            return false;
        }
        else{
        Kocsma k = (Kocsma)obj;
        return super.equals(k) && Arrays.equals(this.cigaretta, k.getCigaretta());
        }
    
    }
}

