public class Vererbung {
    public static void main(String[] args) {
        A a = new A(10);
        B b = new B(12);
        System.out.println(a.doubleValue());
        System.out.println(b.doppelterWert());
    }
}

class Basis {
    int value;

    public int doubleValue() {
        return value * 2;
    }
}

class A extends Basis {

    public A(int value) {
        this.value = value;
    }

}

class B extends Basis {

    public B(int wert) {
        this.value = wert;
    }

    public int doppelterWert(){
        return doubleValue();
    }
}