/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Szikra
 */
public class Teszt {
    public static void main(String[] args) {
        RegularPolygon sokszog1 = new RegularPolygon();
        RegularPolygon sokszog2 = new RegularPolygon(6,4);
        RegularPolygon sokszog3 = new RegularPolygon(10,4,5.6,7.8);
        
        System.out.println(sokszog1);
        System.out.println(sokszog2);
        System.out.println(sokszog3);
    }
}
