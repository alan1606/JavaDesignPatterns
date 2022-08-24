package CreationalPatterns.SimpleFactory;

public class SimpleFactoryMain {
    public static void SimpleFactoryMain(){
        PizzaShop store = new PizzaShop();

        Pizza pepperoniPizza = store.createSmallPizza();

        System.out.println(pepperoniPizza);
    }
}
