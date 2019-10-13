/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat_5;

/**
 *
 * @author szikra
 */
import java.util.Random;

public class Test {
    public static void main(String[] args) {
    Random rnd = new Random();
    
    int[] t = new int[30];
    
    for (int i = 0; i < t.length; i++) {
        t[i] = rnd.nextInt(10);
    }
    
    //System.out.println("Eredeti tomb:");
    printArray(t);
    long timeStart = System.currentTimeMillis();
    insertionSort(t);
    long timeEnd = System.currentTimeMillis();
    //System.out.println("Rendezett tomb:");
    printArray(t);
    //System.out.println("Rendezesi ido ms-ban:");
    System.out.println(timeEnd - timeStart);
    }
    
    static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
        System.out.print(a[i] + " ");
        }
    System.out.println();
    }
    
    static void insertionSort(int[] a) {
    // Write your code here
    //forras: http://algoanim.ide.sk/index.php?page=showanim&id=129
        for(int i = 1; i<a.length;i++){
            int j = i-1;
            while( (j>= 0) && (a[j] > a[j+1]) ){
                int tmp = a[j];
                a[j] = a[j+1];
                a[j+1] = tmp;
                j-=1;
            }
        }
    }
}
