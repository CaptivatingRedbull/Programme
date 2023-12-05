public class Ueberladung {
    public static void main(String[] args) {
        Ueberladung obj = new Ueberladung();
        System.out.println(obj.square(100));
        System.out.println(obj.square(1.0));
    }
    public int square(int value){
        System.out.println("Quadriere int");
        return value * value;
    }
    public double square(double value){
        System.out.println("Quadriere int");
        return value * value;
    }

}
