public class Kontofuehrung {
    public static void main(String[] args) {
        GiroKonto giroKonto = new GiroKonto("5500328876100", 1000F);
        SparKonto sparKonto = new SparKonto("5500328876101", 0.03F);
        System.out.println(giroKonto);
        System.out.println(sparKonto);

        test(giroKonto);
        test(sparKonto);
    }

    public static void test(Konto konto){
        System.out.println(konto.kennung());
        konto.einzahlen(100);
        System.out.println(konto);
    }
}

abstract class Konto {
    float ktoStand;
    String ktoNummer;

    public Konto(String ktoNummer) {
        this.ktoNummer = ktoNummer;
        this.ktoStand = 0;
    }

    boolean einzahlen(float betrag) {
        if (betrag <= 0)
            return false;
        ktoStand += betrag;
        return true;
    }

    abstract String kennung();

    abstract boolean abheben(float betrag);

    @Override
    public String toString() {
        return "Konto{" +
                "ktoStand=" + ktoStand +
                ", ktoNummer='" + ktoNummer + '\'' +
                '}';
    }
}

class SparKonto extends Konto {
    float zins;

    public SparKonto(String ktonummer, float zins) {
        super(ktonummer);
        this.zins = zins;
    }

    String kennung() {
        return "SparKonto";
    }

    void annualZins() {
        ktoStand += ktoStand * zins;
    }

    boolean abheben(float betrag){
        zins = 0;
        if (ktoStand <= betrag || betrag <= 0)
            return false;
        ktoStand -= betrag;
        return true;
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

class GiroKonto extends Konto {
    float dispo;

    public GiroKonto(String ktoNummer, float dispo) {
        super(ktoNummer);
        this.dispo = dispo;
    }

    String kennung() {
        return "GiroKonto";
    }

    boolean abheben(float betrag) {
        if (ktoStand + dispo <= betrag || betrag <= 0)
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
