/**
 * TürmeVonHanoi
 */
public class TürmeVonHanoi {
    public static void main(String[] args) {
        //hanoi(40, 'A', 'B', 'C');
        test(50400);
    }
    public static void test(int x){
        if( --x == 0) return;
        
        test(x);
    }

    /**
     * Bewegen einen Turm mit n scheiben von Stapel a nach Stapel b unter Zuhilfenahme von Stapel c.
     * @param n
     * @param a
     * @param b
     * @param c
     */

    public static void hanoi(int n, char a, char b, char c){
        if(n == 1){
            System.out.println("Bewege Scheibe 1 von " + a + " nach " + b);
        }else{
            hanoi(n-1, a, c, b);
            System.out.println("Bewege scheibe " + n + " von " + a + " nach " + b);
            hanoi(n-1, c, b, a);
        }
    }
    
}