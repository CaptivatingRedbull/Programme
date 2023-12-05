/**
 * Vergleich von Geschwindigkeiten
 */

public class Geschwindigkeit {
    public static void main(String []agrs){
        float v;
        boolean raser; 

        v = 45.0F;
        
        System.out.println("Fahrzeug 1 v > 50? " + (v > 50));

        v = 67.5F;

        System.out.println("Fahrzeug 2 v > 50? " + (v > 50));

        if(v > 50.0F){
            System.out.println("Im 2. Fahrzeug sitzt ein Raser");
        }

        raser = v > 50.0F;

        if (raser){
            System.out.println("Er faehrt " + (v-50) + " zu schnell");
        }
    }
}
