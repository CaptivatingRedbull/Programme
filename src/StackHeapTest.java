public class StackHeapTest {
    double [] data;

    public StackHeapTest(){
        data = new double[1000];
    }

    public static void main(String[] args) {
        //heaptest();
        stacktest(10000);
        /*try {
            Thread.sleep(10000);
        } catch (InterruptedException ignored) {}
        System.out.println("Ende");*/
    }
    public static void heapTest(){
        StackHeapTest[] data = new StackHeapTest[20];

        for(int i = 0; i < data.length; i++){
            data[i] = new StackHeapTest();
        }
        System.out.println(data.length + " x " + (data[0].data.length*8) + " Bytes belegt");
    }
    public static void stacktest(long count){
        double x1,x2,x3,x4,x5,x6,x7,x8,x9,x10,x11,x12,x13,x14,x15,x16;
        x1=x2=x3=x4=x5=x6=x7=x8=x9=x10=x11=x12=x13=x14=x15=x16=1e-12;
        if(count == 0){
            try {
                Thread.sleep(10000);
            } catch (InterruptedException ignored) {}
            System.out.println("Ende");
        }else
            stacktest(--count);
    }
}
