package CreationalPatterns.SimpleFactory;

public class PizzaShop {

    public Pizza createSmallPizza(){
        return new Pizza(6);
    }

    public Pizza createMediumPizza(){
        return new Pizza(8);
    }

    public Pizza createBigPizza(){
        return new Pizza(12);
    }
}
