public class Kontofuehrung {
    public static void main(String[] args) {
        GiroKonto giroKonto = new GiroKonto("5500328876100", 1000F);
    }
}

abstract class Konto {

}

class GiroKonto {
    float ktoStand;
    String ktoNummer;
    float dispo;

    public GiroKonto(String ktoNummer, float dispo){
        this.ktoNummer = ktoNummer;
        this.ktoStand = 0;
        this.dispo = dispo;
    }

    boolean abheben(float betrag) {
        if (ktoStand + dispo < betrag || betrag <= 0)
            return false;
        ktoStand -= betrag;
        return true;
    }

    boolean einzahlen(float betrag) {
        if (betrag <= 0)
            return false;
        ktoStand += betrag;
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
