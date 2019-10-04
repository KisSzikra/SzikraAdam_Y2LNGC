/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Szikra
 */
public class TesztLinearEquation {
    public static void main(String[] args) {
    LinearEquation lin1 = new LinearEquation(2,3,5,7,5,12); //Wikipedia minta
    LinearEquation lin2 = new LinearEquation(3,5,7,9,7,14);
    LinearEquation lin3 = new LinearEquation(6,8,10,12,10,17);
    
        System.out.println(lin1);
        System.out.println(lin2);
        System.out.println(lin3);
    }
}
