public class Kontofuehrung {
    public static void main(String[] args) {
        GiroKonto giroKonto = new GiroKonto("5500328876100", 1000F);
        System.out.println(giroKonto);
    }
}

abstract class Konto {
    float ktoStand;
    String ktoNummer;
    public Konto(String ktoNummer){
        this.ktoNummer = ktoNummer;
        this.ktoStand = 0;
    }
    boolean einzahlen(float betrag) {
        if (betrag <= 0)
            return false;
        ktoStand += betrag;
        return true;
    }

    @Override
    public String toString() {
        return "Konto{" +
                "ktoStand=" + ktoStand +
                ", ktoNummer='" + ktoNummer + '\'' +
                '}';
    }
}

class SparKonto extends Konto{
    float zins;
    public SparKonto(String ktonummer, float zins){
        super(ktonummer);
        this.zins = zins;

    }

    void annualZins(){
        ktoStand += ktoStand * zins;
    }

    @Override
    public String toString() {
        return "SparKonto{" +
                "zins=" + zins +
                ", ktoStand=" + ktoStand +
                ", ktoNummer='" + ktoNummer + '\'' +
                '}';
    }
}

class GiroKonto extends Konto{
    float dispo;

    public GiroKonto(String ktoNummer, float dispo){
        super(ktoNummer);
        this.dispo = dispo;
    }

    boolean abheben(float betrag) {
        if (ktoStand + dispo < betrag || betrag <= 0)
            return false;
        ktoStand -= betrag;
        return true;
    }

    @Override
    public String toString() {
        return "GiroKonto{" +
                "ktoStand=" + ktoStand +
                ", ktoNummer='" + ktoNummer + '\'' +
                ", dispo=" + dispo +
                '}';
    }
}
