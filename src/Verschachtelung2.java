import javax.accessibility.AccessibleValue;

public class Verschachtelung2 {
    public static void main(String[] args) {
        class A implements AValue{
            int aValue;
            public int getValue(){
                return aValue;
            }
        }

        A obj = new A();

        obj.aValue = 100;

        print(new AValue() {
            @Override
            public int getValue() {
                return 100;
            }
        });
        
        System.out.println(obj);
        print(obj);
        x2();
    }

    public static void print(AValue value){
        System.out.println(value.getValue());
    }

    public static void x2(){
        class A {
            int aValue;
        }

        A obj = new A();

        obj.aValue = 100;

        System.out.println(obj);
        System.out.println(obj.aValue);
    }


}

interface AValue{
    int getValue();
}
