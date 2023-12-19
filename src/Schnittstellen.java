public class Schnittstellen {
    public static void main(String[] args) {
        Unreal obj = new Unreal(2);
        Real exp = new Real(0.5);
        RealInterface Realpow = calculate((RealInterface) obj, exp);
        UnrealInterface Unrealpow = calculate((UnrealInterface) obj, exp);

        System.out.println(Realpow);
        System.out.println(Unrealpow);
    }

    public static RealInterface calculate(RealInterface r1, RealInterface r2){
        return new Real(Math.pow(r1.getRealValue(), r2.getRealValue())) ;
    }
    public static UnrealInterface calculate(UnrealInterface r1, UnrealInterface r2){
        return new Unreal((int) (Math.pow(r1.getUnreal(), r2.getUnreal())));
    }
}

interface RealInterface{
    double getRealValue();
}

interface  UnrealInterface{
    int getUnreal();
}

class Unreal implements RealInterface, UnrealInterface{
    private final int number;
    public Unreal(int number){
        this.number = number;
    }

    @Override
    public double getRealValue() {
        return number;
    }

    @Override
    public int getUnreal() {
        return number;
    }
    @Override
    public String toString() {
        return String.valueOf(number);

    }
}

class Real implements RealInterface, UnrealInterface{
    private final double realValue;
    public Real(double realValue){
        this.realValue = realValue;
    }

    public double getRealValue() {
        return realValue;
    }

    @Override
    public String toString() {
        return String.valueOf(realValue);

    }

    @Override
    public int getUnreal() {
        return (int) realValue;
    }
}