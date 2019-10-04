/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Szikra
 */
public class Main {
    public static void main(String[] args) {
        
        //Pont feladat
        Pont p1 = new Pont(0,0);
        Pont p2 = new Pont(0,0);
        Pont p3 = new Pont(0,0);
        Pont p4 = new Pont(0,0);
        
        p1.setY( p1.getY()+5 );
        p2.setY( p2.getY()+5 );
        
        p3.setX( p3.getX()-3.4 );
        p4.setX( p4.getX()-3.4 );
        
        System.out.println("P1: " + p1.getX() + "x " + p1.getY() + "y");
        System.out.println("P2: " + p2.getX() + "x " + p2.getY() + "y");
        System.out.println("P3: " + p3.getX() + "x " + p3.getY() + "y");
        System.out.println("P5: " + p4.getX() + "x " + p4.getY() + "y");
        
        //public RegularPolygon feladat
        RegularPolygon cica1 = new RegularPolygon();    
    }
}
