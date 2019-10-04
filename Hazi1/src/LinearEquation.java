/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Szikra
 */
public class LinearEquation {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }
    
    public boolean isSolvable(){
        if ( ((a*d) - (b*c)) == 0){
            return false;
        }
        
        else {
            return true;
        }
    }
    
    public double getX(){
        if (isSolvable()){
            return ( (e*d) - (b*f) ) / ( (a*d) - (b*c) );
        }
        else {
            return 0;
        }
    }
    
    public double getY(){
        if (isSolvable()){
            return ( (a*f) - (e*c)) / ((a*d) - (b*c));
        }
        else {
            return 0;
        }
    }

    @Override
    public String toString() {
        if (getX() != 0 || getY() != 0){
            return "x: " + getX() + " y: " + getY(); 
        }
        else {
            return "The equation has no solution.";
        }
    }
    
    
}
