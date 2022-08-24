package CreationalPatterns.SimpleFactory;

public class Pizza {
    private int slices;

    public Pizza(int slices){
        this.slices = slices;
    }

    @Override
    public String toString() {
        return "Number of slices: " + this.slices;
    }
}
