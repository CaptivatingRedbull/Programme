public class Mehrdimensional {
    public static void main(String[] args) {
        //int feld [][] = new int[3][3];
        //int feld [][] = {{},{},{}};
        int feld [][] = new int[3][];
        
        for(int i = 0; i<feld.length; i++){
            feld[i] = new int[3*i+1];
        }

        //geht nur bei quadratischen Arrays
        /*for(int k = 0; k<feld.length * feld[k/feld.length].length; k++){
            feld[k/feld.length][k%feld[k/3].length] = k/feld.lenght + k%feld[k/3].lenght;
        }*/

        for(int i = 0; i<feld.length; i++){
            for (int j = 0; j<feld[i].length; j++){
                feld [i][j] = i + j; 
            }
        }

        for(int i = 0; i<feld.length; i++){
            for (int j = 0; j<feld[i].length; j++){
                System.out.print(feld[i][j] + " ");
            }
            System.out.println();
        }
    }
}
