public class Vererbung {
    public static void main(String[] args) {
        A a = new A(10);
        B b = new B(12);
        Basis basis = new Basis(5);

        System.out.println(basis.doubleValue());
        System.out.println(a.doubleValue());
        System.out.println(b.doppelterWert());
    }

    public static void print(Basis b) {
        System.out.println(b.doubleValue());
    }

    public static void print(B obj) {
        System.out.println(obj.doppelterWert());
    }
}

class Basis {
    protected int value;

    public Basis(int value) {
        this.value = value;
    }

    protected int doubleValue() {
        return value * 2;
    }

    @Override
    public String toString() {
        return "Basis";
    }
}

class A extends Basis {

    public A(int value) {
        super(value);
    }

    public A() {
        this(10);
    }

    @Override
    public String toString() {
        return "A";
    }
}

class B extends A {

    public B(int wert) {
        super(wert);
    }

    public int doppelterWert() {
        return doubleValue();
    }

    @Override
    public String toString() {
        return (super.toString());
    }
}