/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat_4;

/**
 *
 * @author Szikra
 */
public class TeherAuto extends Auto{
    private int maxSzallithatoTeher;

    public TeherAuto(int maxSzallithatoTeher) {
        this.maxSzallithatoTeher = maxSzallithatoTeher;
    }

    public TeherAuto(String rendszam, int motorTelljesitmeny, int maxSzallithatoTeher) {
        super(rendszam, motorTelljesitmeny);
        this.maxSzallithatoTeher = maxSzallithatoTeher;
    }

    public int getMaxSzallithatoTeher() {
        return maxSzallithatoTeher;
    }

    @Override
    public String toString() {
        return "TeherAuto{" + "maxSzallithatoTeher=" + maxSzallithatoTeher + '}';
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
        final TeherAuto other = (TeherAuto) obj;
        if (this.maxSzallithatoTeher != other.maxSzallithatoTeher) {
            return false;
        }
        return true;
    }
    
    
}
