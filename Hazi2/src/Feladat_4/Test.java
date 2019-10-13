/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat_4;

/**
 *
 * @author Szikra
 */
public class Test {
    
    public static void rendezMaxSzallithatoTeherCsokkenoleg( TeherAuto[] teher ){
    
        for (int i=0;i<teher.length-1;i++) {
            for (int j=i+1;j<teher.length;j++) {
                if(teher[i].getMaxSzallithatoTeher() < teher[j].getMaxSzallithatoTeher()) {
                    TeherAuto tmp = teher[j];
                    teher[j] = teher[i];
                    teher[i] = tmp;
                }
            }
        }
        
    }
    
    public static int keresMaxMotorTeljesitmeny(Auto[] auto){
        
        int max = Integer.MIN_VALUE;
        
        for(int i= 0;i<auto.length;i++){
            if(max < auto[i].getMotorTelljesitmeny()){
                max = auto[i].getMotorTelljesitmeny();
            }
        }
        
        return max;
    }
    
    public static void main(String[] args) {
        Auto[] autoArray = new Auto[10];
        
        autoArray[0] = new Auto("ABC123", 10);
        autoArray[1] = new Auto("ABC123", 8);
        autoArray[2] = new Auto("ABC123", 12);
        autoArray[3] = new Auto("ABC123", 5);
        autoArray[4] = new Auto("ABC123", 6);
        autoArray[5] = new TeherAuto("ASD234", 9, 6);
        autoArray[6] = new TeherAuto("ASD234", 7, 9);
        autoArray[7] = new TeherAuto("ASD234", 13, 10); //Legnagyobb teljesitmeny
        autoArray[8] = new TeherAuto("ASD234", 11, 5);
        autoArray[9] = new TeherAuto("ASD234", 4, 7);
        
        TeherAuto[] teherArray = new TeherAuto[10];
        teherArray[0] = new TeherAuto("ASD234", 10, 9);
        teherArray[1] = new TeherAuto("ASD234", 1, 10);
        teherArray[2] = new TeherAuto("ASD234", 9, 7);
        teherArray[3] = new TeherAuto("ASD234", 2, 12);
        teherArray[4] = new TeherAuto("ASD234", 5, 6);
        teherArray[5] = new TeherAuto("ASD234", 4, 3);
        teherArray[6] = new TeherAuto("ASD234", 7, 7);
        teherArray[7] = new TeherAuto("ASD234", 8, 10);
        teherArray[8] = new TeherAuto("ASD234", 11, 5);
        teherArray[9] = new TeherAuto("ASD234", 12, 8);
        
        System.out.println("Legnagyobb teljesitmeny:");
        System.out.println(keresMaxMotorTeljesitmeny(autoArray));
        
        System.out.println("Rendezes utan:");
        rendezMaxSzallithatoTeherCsokkenoleg(teherArray);
        for(int i=0;i<teherArray.length;i++){
            System.out.print(teherArray[i].getMaxSzallithatoTeher() + " ");
        }
        
    }
}
