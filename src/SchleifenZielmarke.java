public class SchleifenZielmarke {
    public static void main(String[]args){
        ZIELMARKE:
        for (int i = 0; i<4; i++){
            for(int j /*=i */= 0; j< 3; j++){
                System.out.println(i+" "+j);
                if(j == 2)break ZIELMARKE;
            }
        }
    }
}
