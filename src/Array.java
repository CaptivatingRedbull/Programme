public class Array {
    public static void main(String[] args) {
        double [] feld = new double[2];
        feld[0] = 15;
        feld[1] = 3;
        swap(feld);

        System.out.println("in main " + feld[0]);
        print(feld);
        System.out.println("in main " + feld[0]);
    }

    public static void print(double [] verweis){
        verweis[0]/=2;
        System.out.println("in print: " + verweis[0]);
    }
    public static void swap(double [] data){
        double t = data [0];
        data[1] = data[0];
        data[0] = t;
    }

    public static void swap(double u, double v){
        double t = u;
        u = v;
        v = t;
    }
}
