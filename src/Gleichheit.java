/*
public class Gleichheit {
    public static void main(String[] args) {
        Euro e = new Euro(5);
        Euro d = new Euro(5);


        System.out.println("Referenzgleichheit: " + e.equals(new String("ajsdhjka")));
    }
}

class Euro {
    double value;

    public Euro(double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Euro e) {
            return e.value == this.value;
        } else
            return false;
    }
}
*/


public class Gleichheit {
    public static void main(String[] args) {
        String a = new String("Alphabet");
        String b = new String("Alphabet");
        String c = b;

        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println(b == c);
    }
}