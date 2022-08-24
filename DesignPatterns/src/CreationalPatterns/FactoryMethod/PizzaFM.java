package CreationalPatterns.FactoryMethod;

public class PizzaFM {
    private int slices;
    private String specialty;

    public PizzaFM(int slices, String specialty){
        this.slices = slices;
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return "Number of slices: " + this.slices + "\nSpecialty: " + this.specialty;
    }
}
