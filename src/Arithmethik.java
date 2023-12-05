/**
 * Arithmetik1
 */
public class Arithmethik {
    public static void main(String[]args){
        int a = 14, b =3; 
        int quot, rest; 

        quot = a/b; 
        rest = a%b;
        System.out.println(a + " geteilt durch " + b + " ist " + quot);
        System.out.println(a + " mod " + b + " ist " + rest);

        
        float q, r; 

        q = (float)a/b; 
        r = (float)a%b;
        System.out.println(a + " geteilt durch " + b + " ist " + q);
        System.out.println(a + " mod " + b + " ist " + r);
    }
}
