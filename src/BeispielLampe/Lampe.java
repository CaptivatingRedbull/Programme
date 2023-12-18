package BeispielLampe;

public class Lampe {
    private Lumen helligkeit, maxhelligkeit;
    private boolean schaltZustand;
    private Leuchtmittel leuchtmittel;

    public Lampe(){
        this(new Lumen(1000), new Leuchtmittel("LED"));
    }

    public Lampe(Lumen maxHelligkeit, Leuchtmittel leuchtmittel){
        schaltZustand = false;
        helligkeit = new Lumen(0);
        this.maxhelligkeit = maxHelligkeit;
        this.leuchtmittel = leuchtmittel;
    }

    public void einschalten(){
        schaltZustand = true;
    }

    public void ausschalten(){
        schaltZustand = false;
    }
    
    public void dimmen(boolean heller){
        if(heller && helligkeit.lumen < maxhelligkeit.lumen)
            helligkeit.lumen++;
        else if (helligkeit.lumen > 0) 
            helligkeit.lumen--;
    }

    @Override
    public String toString() {
        return (this +  (String.valueOf(this.helligkeit.lumen)) + (this.schaltZustand) + (this.leuchtmittel.leuchtmittel));
    }

    public void print (Lampe lampe){
        System.out.println(lampe);
        System.out.println(lampe.helligkeit.lumen);
        System.out.println(lampe.schaltZustand);
        System.out.println(lampe.leuchtmittel.leuchtmittel);
    }
}