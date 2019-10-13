//package Budapest_Kupa_1;

import java.util.*;

/**
 *
 * @author Szikra
Feladat:
https://progcont.hu/progcont/100191/?pid=201011

Bemenet:
5
2017;05;14;Budaorsi dolomitok;5;4;3;5;5
2017;02;04;Kitaibel Pal emlektura;2;3;2;3
2017;04;01;Baba;3;3;3;4;3;3;3
2017;01;21;Toldi Miklos emlektura;6;4;6;4
2017;04;01;Pipi;4;4;4

Kimenet:
2017;04;01;Baba
2017;05;14;Budaorsi dolomitok
*/

class Adatok{
    String ev;
    String honap;
    String nap;
    String turaNeve;
    int[] reszTav;

    public Adatok(String ev, String honap, String nap, String turaNeve, int[] reszTav) {
        this.ev = ev;
        this.honap = honap;
        this.nap = nap;
        this.turaNeve = turaNeve;
        this.reszTav = reszTav;
    }

    public String getEv() {
        return ev;
    }

    public String getHonap() {
        return honap;
    }

    public String getNap() {
        return nap;
    }

    public String getTuraNeve() {
        return turaNeve;
    }

    public int[] getReszTav() {
        return reszTav;
    }
    
    public int getTavokOsszege(){
        
        int osszeg = 0;
        for(int i=0;i<reszTav.length;i++){
            osszeg += reszTav[i];
        }
        
        return osszeg;
    }
    
    @Override
    public String toString() {
        return ev + ";" + honap + ";" + nap + ";" + turaNeve; 
    }
}

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String line = sc.nextLine();
        
        int n = Integer.parseInt(line);
        
        ArrayList <Adatok> list = new ArrayList<Adatok>();
        
        for(int i=0;i<n;i++){
            line = sc.nextLine();
            String[] parts = line.split(";");
            
            int[] reszTavok = new int[parts.length-4];
            int counter = 0;
            for(int j = 4;j<parts.length;j++){
                reszTavok[counter] = Integer.parseInt(parts[j]);
                counter++;
            }
            
            list.add(new Adatok(parts[0], parts[1], parts[2], parts[3], reszTavok));
        }

        Collections.sort(list, Comparator.comparing(Adatok::getEv).thenComparing(Adatok::getHonap).thenComparing(Adatok::getNap).thenComparing(Adatok::getTuraNeve));

        int max = 0;
        for(Adatok adatok : list){
            if(adatok.getTavokOsszege() > max){
                max = adatok.getTavokOsszege();
            }
        }
        
        for(Adatok adatok: list){
            if(adatok.getTavokOsszege() == max){
                System.out.println(adatok.toString());
            }
        }
        
        
    }
    
}
