public class Verschachtelung {
    public static void main(String[] args) {
        Outer obj = new Outer();
        Outer.Inner inner = obj.new Inner();

        System.out.println(obj);
        System.out.println(inner);

    }
}

class Outer {
    String name = "OuterObject: ";

    class Inner {
        boolean active = true;

        @Override
        public String toString() {
            return name + active;
        }
    }
}
