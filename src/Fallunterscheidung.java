public class Fallunterscheidung {
    public static void main(String[]args){
        int a = 0, b = 0;  
        boolean logAusdruck = a > b;
        if(logAusdruck)
            System.out.println("true zweig");
        else{
            System.out.println("false zweig");
        }

        switch(a-b){
            case 0:
                System.out.println("a==b");
                break;
            case 1: 
                System.out.println("a ist um 1 größer als b");
                break;
            default: 
                System.out.println("a und b sind unterschiedlich");
        }
    }
}
