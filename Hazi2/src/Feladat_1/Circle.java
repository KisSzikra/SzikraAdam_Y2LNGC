/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Szikra
 */

package Feladat_1;

import java.math.*;

public class Circle extends GeometricShape{
    private double radius;

    public Circle() {
        this.radius = 1;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea(){
        return Math.pow(radius,2) * Math.PI;
    }
    
    public double getPerimeter(){
        return 2*(Math.PI * radius);
    }
    
    public double getDiameter(){
        return 2*radius;
    }    
}
