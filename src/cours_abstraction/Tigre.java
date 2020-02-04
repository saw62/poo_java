package cours_abstraction;

public class Tigre extends LivingSpecies
{
    public Tigre(){
        name = "abstraction.Tigre";
    }

    public void eat(){
        System.out.println("Je mande de la viande");
    }

    public void speak(){
        System.out.println("je rugis ... ");
    }

}
