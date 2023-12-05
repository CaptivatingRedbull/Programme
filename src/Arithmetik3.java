/**
 * Arithmetik3
 */
public class Arithmetik3 {
    public static void main(String[]args){
        int a = 0; 
        
        System.out.println(a);
        System.out.println(++a);
        System.out.println(a += 1);
        System.out.println(a = a + 1);
        System.out.println(a = a - 1);
        System.out.println(a -= 1);
        System.out.println(--a);
        System.out.println(a);

        int x, y, z; 
        x = (y = (z = 0) + 1)+1; 
        System.out.println(x + " " + y + " " + z);
    }
}