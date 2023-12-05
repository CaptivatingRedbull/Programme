package BeispielLampe;

public class LampeTest {
    public static void main(String[] args) {
        Lampe lampe = new Lampe(new Lumen(1000), new Leuchtmittel("ARGON"));
        Lampe ledLampe = new Lampe();

        lampe.einschalten();

        for(int i = 0; i < 10; i++)
            lampe.dimmen(false);
        
        lampe.print(lampe);
    }
}