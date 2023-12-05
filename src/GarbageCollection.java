import static java.lang.Thread.sleep;

public class GarbageCollection {
    double [] speicher = new double[1000000000];
    public static void main(String[] args) {
        GarbageCollection waste = new GarbageCollection();

        try {
            sleep(30000);
        } catch (InterruptedException ignored){}

    }
}
