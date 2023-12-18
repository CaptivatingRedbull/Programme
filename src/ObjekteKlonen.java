public class ObjekteKlonen {
    public static void main(String[] args) {
        Schaf dolly = new Schaf("dolly");
        Schaf dolly2 = (Schaf) dolly.clone();

        System.out.println(dolly = dolly2);
    }
}
class Schaf{
    String name;
    public Schaf(String name){
        this.name=name;
    }

    @Override
    public Object clone(){
        return new Schaf(this.name);
    }
}
