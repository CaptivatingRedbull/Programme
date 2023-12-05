/**
 * Konvertierung2
*/
public class Konvertierung2 {
    public static void main(String[]args){
        /*int z = 127 + 1;
        byte b = (byte)z;*/
        byte b = -128; 
        int z = b;  //geht implitzit
        System.out.println(z);
        System.out.println(b);
    }
}