/* Selbstreferenz */

public class Selbstreferenz {
    int value; 

    public static void main(String[] args) {
        Selbstreferenz ref = new Selbstreferenz();
        ref.test(ref);
    }

    public void test (Selbstreferenz ref){
        System.out.println();
        System.out.println(this);
        System.out.println(ref == this);
    }


}
