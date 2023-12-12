package BeispielLampe;

import java.util.concurrent.LinkedTransferQueue;

public class LampeTest {
    public static void main(String[] args) {
        Lampe[] lampenLaden = {new Lampe(new Lumen(1000), new Leuchtmittel("ARGON")), new Lampe(), new Lampe()};

        for (int i = 0; i < lampenLaden.length; i++){
            for(int j = 0; i < 10; i++)
                lampenLaden[i].dimmen(true);
            System.out.println(lampenLaden[i]);

        }
    }
}