package Feladat_1;

import Feladat_2.Triangle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author szikra
 */
public class Test {

    public static void main(String[] args) {
        
        Circle circle = new Circle(1.0);
        System.out.println("A circle " + circle.toString());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());
        
        Rectangle rectangle = new Rectangle(2.0, 4.0);
        System.out.println(System.getProperty("line.separator") + "A rectangle " +
        rectangle.toString());
        System.out.println("The area is " + rectangle.getArea());
        System.out.println("The perimeter is " + rectangle.getPerimeter());
        
        Triangle triangle1 = new Triangle(1, 1.5, 1, "yellow", true);
        System.out.println("A triangle " + triangle1.toString());
        System.out.println("The area is " + triangle1.getArea());
        System.out.println("The perimeter is " + triangle1.getPerimeter());
    
    }    
}
