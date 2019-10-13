/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat_2;

/**
 *
 * @author szikra
 */
public class Test {
    public static void main(String[] args) {
        Triangle haromszog1 = new Triangle(1, 1.5, 1, "yellow", true);
        System.out.println("Area: " + haromszog1.getArea()+ " Perimeter: " + haromszog1.getPerimeter() + " Filled: " + haromszog1.isFilled());
    }
}
