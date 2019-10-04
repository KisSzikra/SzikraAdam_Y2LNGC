/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Szikra
 */
public class RegularPolygon {
    private int n = 3; //Oldalak szama
    private double side  = 1; //Oldal hossza
    
    private double x;
    private double y;

    public RegularPolygon(double x, double y) {
        this.x = 0;
        this.y = 0;
    }

    public RegularPolygon(){
    this.n=3;
    this.side=1;
    this.x=0;
    this. y=0;
    }   
    
    public RegularPolygon(int n, double side){
    this.n=n;
    this.side=side;
    this.x=0;
    this. y=0;
    }
    
    public RegularPolygon(int n, double side, double x, double y){
    this.n=n;
    this.side=side;
    this.x=x;
    this. y=y;
    }

    public int getN() {
        return n;
    }

    public double getSide() {
        return side;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public double getPerimeter(){
        return this.side * this.n;
    }
    
    public double getArea(){
    return (this.n * (this.side * this.side)) / (4.0 * Math.tan((Math.PI / this.n)));
    }

    @Override
    public String toString() {
        return "Oldalak szama: " + n + " 1 oldal hossza: " + side + " Kerulete: " + this.getPerimeter() + " Terulete:" + this.getArea();
    }
    
    
    
}
