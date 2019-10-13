package Hullamvasutak;

import java.util.*;

/**
 *
 * @author Szikra
 
 * Feladat:
 * https://progcont.hu/progcont/100243/?pid=201191
 
 * Bemenet:
6
Furius baco;Polynesia;140;120
Shambhala;China;140;120
Dragon Khan;China;140;80
Stampida;Far West;120;20
Tami Tami;SesamoAventura;100;20
El Diablo;Mexico;140;30
    
 * Kimenet:
    Stampida (Far West): 20
    Tami Tami (SesamoAventura): 20
    El Diablo (Mexico): 30
    Dragon Khan (China): 80
    Furius baco (Polynesia): 120
    Shambhala (China): 120
 */

class Adatok{
    String vasutNev;
    String vilagNev;
    int legkisebbMagassag;
    int varakozasiIdo;

    public Adatok(String vaasutNev, String vilagNev, int legkisebbMagassag, int varakozasiIdo) {
        this.vasutNev = vaasutNev;
        this.vilagNev = vilagNev;
        this.legkisebbMagassag = legkisebbMagassag;
        this.varakozasiIdo = varakozasiIdo;
    }

    public String getVasutNev() {
        return vasutNev;
    }

    public String getVilagNev() {
        return vilagNev;
    }

    public int getLegkisebbMagassag() {
        return legkisebbMagassag;
    }

    public int getVarakozasiIdo() {
        return varakozasiIdo;
    }

    @Override
    public String toString() {
        return vasutNev + " (" + vilagNev + "): " + varakozasiIdo;
    }
    
    
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String line = sc.nextLine();
        
        int n = Integer.parseInt(line);
        
        ArrayList<Adatok> list = new ArrayList<Adatok>();
        
        for(int i=0;i<n;i++){
            line = sc.nextLine();
            String[] parts = line.split(";");
            
            list.add(new Adatok(parts[0], parts[1], Integer.parseInt(parts[2]), Integer.parseInt(parts[3])));
            
        }
        
        //varakozas novekbo
        //magassag csokkeno
        //vasutNev novekvo
             
        Collections.sort(list, Comparator.comparing(Adatok::getVarakozasiIdo)
        .thenComparing(Adatok::getLegkisebbMagassag, Comparator.reverseOrder())
        .thenComparing(Adatok::getVasutNev)
        );
        
        Collections.sort(list, Comparator.comparing(Adatok::getVarakozasiIdo) );
        
        for(Adatok adatok : list){
            System.out.println(adatok.toString());
        }
        
    }
}
