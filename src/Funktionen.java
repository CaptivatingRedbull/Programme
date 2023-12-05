/*Funktionen */

public class Funktionen {
    public static void main(String[] args) {
        /* 
        System.out.println("Bausteine von Software können sein:");
        int stars = 20;
        printStars(stars);
        System.out.println("\tFunktionen");
        printStars(stars);
        System.out.println(power(2,3));
        
        for(int i = -10; i <= 10; i++){
            System.out.println(i + "\t" + winkelHalbierende(i));
        }
        */

        System.out.println(test(10));
    }

    public static void printStars(int stars){
        for(int i = 0; i < stars; i++){
            System.out.print("*");
        }
        System.out.println();
    }

    public static long power(int basis, int exponenten){
        long p = 1; 
        for(int i = 0;i < exponenten;i++){
            p *= basis;
        }
        return p;
    }

    public static void swap(int a, int b){
        System.out.println(a + " " + b);
        int z = a; 
        a = b; 
        b = z;
        System.out.println(a + " " + b);
        
    }

    public static double gerade(double m, double n, double x){
        return m*x+n;
    }

    public static double winkelHalbierende(double x){
        double y = 0;
        y = gerade(1, 0, x);
        return y;
    }

    public static boolean test(int i){
        System.out.println("Stapelhöhe: " + i);
        if (i==0){
            return false;
        }else{
            return test(i-1);
        }
    }
}