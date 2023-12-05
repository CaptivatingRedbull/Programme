public class Statisch {
    static int globalZahl;

    public static void main(String[] args) {
        globalZahl = 22;
        System.out.println(globalZahl);

        Statisch dynamisch = null;
        for(int i = 0; i< 10; i++)
            dynamisch = new Statisch();

        System.out.println(Statisch.globalZahl);
    }
}