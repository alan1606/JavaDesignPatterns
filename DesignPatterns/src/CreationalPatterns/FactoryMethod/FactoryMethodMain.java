package CreationalPatterns.FactoryMethod;

public class FactoryMethodMain {
    public static void FactoryMethodMain(){
        PizzaShopCF dominos = new PizzaShopCF();

        PizzaFM peperoni = dominos.createPizza("peperoni");
        PizzaFM hawai = dominos.createPizza("hawai");
        PizzaFM extraCheese = dominos.createPizza("PEPERONI EXTRA CHEESE");

        System.out.println(peperoni);
        System.out.println(hawai);
        System.out.println(extraCheese);
    }
}
