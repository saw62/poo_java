abstract public class LivingSpecies
{
    protected String name;

    public String whoAmI(){
        return this.name;
    }

    abstract public void eat();
    abstract public void speak();
}
