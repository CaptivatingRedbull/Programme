public class Fakultaet {
    public static void main(String[] args) {
        for (int i = 0; i < 25;i++){
            System.out.println(fak(i));
        }
    }

    private static double fak(int n) {
        return n == 0 ? 1 : n * fak(-1);
        
        /*if (n==0){
            return 1;
        }else{
            return n * fak(n-1);
        }
        */
    }
    
}
