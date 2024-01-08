public class Aufzaehlungen {
    enum Besteck{
        MESSER, GABEL, LOEFFEL, TASSE, UNTERTASSE, TELLER;

        public String verwendeBesteck(Besteck besteck){
            return switch (besteck) {
                case MESSER -> "Mit dem Messer kann man Schneiden.";
                case GABEL -> "Aufspießen";
                case LOEFFEL -> "Loeffeln";
                case TASSE -> "Trinken";
                case TELLER -> "Aufladen";
                case UNTERTASSE -> "Untersetzen";
                default -> "Ohne Besteck kann man nur mit den Fingern essen.";
            };
        }

        @Override
        public String toString() {
            return verwendeBesteck(this);
        }
    }
    public static void main(String [] args){

        for (Besteck besteck1: Besteck.values())
            System.out.println(besteck1);

    }




}
