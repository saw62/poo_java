package cours_interface;

public class Cottage {
    public Cottage() {
        System.out.println("Parcelle en place ...");
    }

    public void build(String material) {
        System.out.println("Construction du batiment en " + material);
    }
}
