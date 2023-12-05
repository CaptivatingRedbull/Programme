package ArrayVonObjekten;

public class ObjectArray {
    public static void main(String[] args) {
        //schritt 1: Platz für die Referenzen schaffen
        Beispiel[]example = new Beispiel[1000];

        //Schritt 2: Objektreferenzen erstellen und in Array ablegen
        for(int i = 0; i < example.length;i++){
            example[i] = new Beispiel(i);
        }

        for(int i = 0; i < example.length; i++){
            System.out.println(example[i].value);
        }
        System.out.println();
    }
}
