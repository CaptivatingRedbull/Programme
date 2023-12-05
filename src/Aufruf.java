public class Aufruf {
    public static void main(String[] args) {
        double original = 7;
        nimmWert(original);
        System.out.println("Original: " + original);
    }
    public static void nimmWert(double value){
        value = value/2;
        System.out.println("nimmWert: " + value);
    }
}
