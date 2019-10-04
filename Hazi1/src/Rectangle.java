/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Szikra
 */
public class Rectangle {
public double width;
public double height;
    
    public Rectangle(){ //default konstruktor
        this.height = 1;
        this.width = 1; 
    }
    
    public Rectangle(double w, double h){
        this.width = w;
        this.height = h;
    }
    
    public double getArea(){
        return this.height * this.width;
    }
    
    public double getPerimeter(){
        return (this.height + this.width)*2;
    }
    
    // Alt+Insert billkombora behozza a toString()-dolgot.
    @Override
    public String toString() {
        return "Szelesseg: " + width + " Magassag:" + height + '\n' + "Terulet = " + this.getArea() + '\n' + "Kerulet: " + this.getPerimeter() + '\n';
    }
    
}
