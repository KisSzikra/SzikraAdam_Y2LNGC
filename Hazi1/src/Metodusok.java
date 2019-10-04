/**
 *
 * @author Szikra
 */

import java.util.Arrays; 

public class Metodusok {
    public static void Metodus_1(int a, int b, int c){
            //Írjunk eljárást, amely paraméterként kap három egész számot. 
            //Írjuk ki őket növekvő sorrendben!
            int[] array = {a,b,c};

            Arrays.sort(array);

            System.out.printf(Arrays.toString(array));        
        }

    public static void Metodus_2(double a, double b, double c){ //float ???
            //Írjunk eljárást, amely paraméterként kap három valós számot. 
            //Határozzuk meg és írjuk ki a három adott valós szám minimumát,
            //és abszolút értékeinek maximumát!
            double[]array = {a,b,c};
            double tmp = Double.MAX_VALUE; //Legnagyobb double ertek

            for(int i=0;i<array.length;i++){
                if (array[i] < tmp){ //Minimum kereses
                    tmp = array[i];
                }
            }
            System.out.println("Minimum: " + tmp);

            tmp = Double.MIN_VALUE; //Legkisebb double ertek
            for(int i=0;i<array.length;i++){
                array[i] = Math.abs(array[i]); //Abszolut ertek
                if (array[i] > tmp){ //Maximum kereses
                    tmp = array[i];
                }
            }

            System.out.print("Absolut maximum: " + tmp);

        }

    public static void Metodus_3(double a, double b, double c, double d){
            //Írjunk eljárást, amely paraméterként kap három valós számot. 
            //Határozzuk meg és írjuk ki a három adott valós szám minimumát
            //és abszolút értékeinek maximumát!
            System.out.println(a + " " + b + " " + c + " "+d);

            if(d >=0){
                System.out.print(a + " " + c + " " + b + " "+d);
            }
            else{
                System.out.print(a + " " + b + " " + d + " "+c);
            }
        }

    public static boolean Metodus_4(double a, double b, double c){
         /*Adott három szigorúan pozitív valós szám: a, b, c. Írjunk függvényt, 
         //amely paraméterként megkapja ezeket a számokat és eldönti, 
         hogy képezhetik-e ezek a számok egy háromszög oldalait 
         (legyen a függvénynek visszatérítési értéke: boolean típusú)*/
            if (a <= 0 || b <= 0 || c <= 0){
                return false;
            }

            if ( (a > (b+c)) && (a > (b+c)) && (a > (b+c))){
                return true;
            }
            else{
                return false;
            }
        }

    public static int Metodus_5(int ev1, int ev2){
        /*Írjunk függvényt, amely visszaadja, 
        hogy hány szökőév volt/lesz két különböző
        évszám között! (a két évszámot paraméterként adjuk át)
        Útmutatás: A szökőév osztható 4-gyel és nem osztható 100-zal, vagy osztható    
        */

        int darab = 0;
        for(int i=ev1;i<=ev2;i++){
            if ( (i%4 == 0) && (i % 100 != 0) || (i%400 == 0)){
                darab++;
            }
        }
        return darab;
        }

    public static void Metodus_6(int jegy){
        /*
        Írjunk eljárást, amely paraméterként megkap egy dolgozatra adott jegyet, és kiírja
        a dolgozat szöveges értékelését az érdemjegy alapján (Használjunk switch
        szerkezetet)
        */
        switch (jegy){
            case 1:
                System.out.println("Egyes");
            break;

            case 2:
                System.out.println("Kettes");
            break;

            case 3:
                System.out.println("Harmas");
            break;

            case 4:
               System.out.println("Negyes");
            break;

            case 5:
                System.out.println("Otos");
            break;

            default:

        }
        }

    public static void Metodus_7(int a, int b){
        /*
        Számítsuk ki két természetes szám egész hányadosát ismételt kivonásokkal
        */
            int hanyados = 0;
            while( a >= b){
                hanyados++;
                a = a - b;
            }
            System.out.println("Hanyados: " + hanyados);
        }

    public static void Metodus_8(int n){
        /*
        Adva van egy nullától különböző természetes szám (n). 
        Tervezzünk algoritmust, amely eldönti, 
        hogy az adott szám prímszám-e vagy sem!
        */
            boolean status = false;
            int osztokSzama = 0;

            int oszto = 1;

            for(int i=oszto;i<n;i++){
                if( (n%i) == 0){
                    osztokSzama++;
                }

                if (osztokSzama >2){
                    System.out.println("nem Prim");
                    break;
                }
            }


            if (osztokSzama <= 2){
                System.out.println("Prim");
            }        
        }

    public static void Metodus_9(int n){
    /*
    Generáljuk és írjuk ki az első n Fibonacci-számot
    */
    int a=1, b=0;
    for(int k=1;k<n;k++){
        System.out.print(b + " ");
        b += a;
        a = b - a;
    }
    }

    public static void Metodus_10(int n){
        /*
        Adott az n természetes szám, amelynek legfeljebb 9 számjegye van.
        Hozzuk létre és írjuk ki azt a számot, 
        amely az eredeti szám számjegyeit fordított sorrendben tartalmazza.
        */
       int ujSzam=0;
       while(n!=0){
        ujSzam=ujSzam*10+(n%10);
        n=n/10;
       }
       
       System.out.println(ujSzam + " ");
       }
    
    public static void Metodus_11(int n){
        /*
        Írjunk függvényt, amely paraméterként kap egy 0 és 12 közötti egész számot,
        és visszaadja annak faktoriálisát! 
        (Azért csak ekkoráét, mert a 12 faktoriálisa még tárolható 
        egy unsigned long típusban.)
        */
        long faktorialis = 1;
        for(int i = 1;i<=n;i++){
           faktorialis *= i;
        }    
           
        System.out.println(faktorialis);
        }

    public static void Metodus_12( int k, int n1, int n2){
        /*
        Írjunk eljárást, amely megtalálja és kiírja az összes k-val osztható számot,
        amelyek két adott szám (n1 és n2 …ezeket az eljárás paraméterei) között találhatók!
        */
        for(int i=n1;i<=n2;i++){
         if(i%k==0){
             System.out.print(i + " ");
         }
        }
       }
    
    public static void Metodus_13(int n){
        /*
        Írjunk függvényt, amely megkeresi azt a legkisebb Fibonacci-számot, 
        amely nagyobb mint egy adott n szám (az n számot paraméterként adjuk át,
        az eredményt visszatérítési értékként)!
        */
        int a=1, b=0;
        for(int k=1;k<n;k++){
            b += a;
            a = b - a;
            
            if(b > n){
                System.out.println(b);
                break;
            }
        }
    } 

    public static void Metodus_14(){
        /*
        Írjunk eljárást, amely megkeresi azokat az 1000-nél kisebb számokat,
        amelyek egyenlők számjegyeik köbének összegével! 
        Ezeket írjuk a standard kimenetre.
        */
        for(int i=0;i<1000;i++){

            int szam = i;

            int szazasok = szam / 100;

            szam -= szazasok * 100;

            int tizesek = szam / 10;
            szam -= tizesek * 10;

            int egyesek = szam;

            if ( (Math.pow(egyesek, 3) + Math.pow(tizesek, 3) + Math.pow(szazasok, 3)) == i){
                System.out.print(i + " ");
            }
        }    
       }
    
    public static void main(String[] args) {
        
        System.out.println("Metodus 1");
        Metodus_1(0, 0, 0);
        System.out.println("\n");
        
        System.out.println("Metodus 2");
        Metodus_2(0, 0, 0);
        System.out.println("\n");
        
        System.out.println("Metodus 3");
        Metodus_3(0, 0, 0, 0);
        System.out.println("\n");
        
        System.out.println("Metodus 4");
        Metodus_4(0, 0, 0);
        System.out.println("");
        
        System.out.println("Metodus 5");
        Metodus_5(0, 0);
        System.out.println("");
        
        System.out.println("Metodus 6");
        Metodus_6(0);
        System.out.println("");
        
        System.out.println("Metodus 7");
        Metodus_7(20, 10);
        System.out.println("");
        
        System.out.println("Metodus 8");
        Metodus_8(7);
        System.out.println("");
        
        System.out.println("Metodus 9");
        Metodus_9(20);
        System.out.println("\n");
        
        System.out.println("Metodus 10");
        Metodus_10(193);
        System.out.println("");
        
        System.out.println("Metodus 11");
        Metodus_11(6);
        System.out.println("");
        
        System.out.println("Metodus 12");
        Metodus_12(4, 8, 80);
        System.out.println("\n");
        
        System.out.println("Metodus 13");
        Metodus_13(20);
        System.out.println("");
        
        System.out.println("Metodus 14");
        Metodus_14();
        System.out.println("");
    }
}
