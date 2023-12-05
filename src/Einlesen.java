import java.util.Scanner;

/** Einlesen von Tastatur */
public class Einlesen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* 
        System.out.print("Bitte ein Wort eingeben: ");
        String wort = scanner.next();
        System.out.println(wort);

        System.out.print("Bitte eine Zahl eingeben: ");
        int zahl = scanner.nextInt();
        System.out.println(zahl);
        */
        System.out.print("Bitte eine Kommazahl eingeben: ");
        double kommazahl = scanner.nextDouble();
        System.out.println(kommazahl);
        //*/
        
        System.out.println(scanner.nextLine());
        System.out.println("Bitte eine beliebige Zeile eingeben: ");
        String zeile = scanner.nextLine();
        System.out.println(zeile);

        scanner.close();
    }
}
