package cours_interface;
//d'abord extension ensuite interface on peux mettre plusieurs interface
public class Glider extends Vehicule implements Volant {
    public Glider() {
        this.movementSpeed = 28;
    }

    public void moveXY(int x, int y) {
        System.out.println("Le planeur fend l'air ver " + x + ", " + y);
    }

     public void fly(String energy){
        System.out.println("Je me propulse avec du " + energy);
    }
    public void boost(int x){
        System.out.println("propulssion a " + x );
    }
}
