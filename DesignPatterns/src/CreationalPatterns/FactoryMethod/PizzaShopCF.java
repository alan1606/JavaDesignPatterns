package CreationalPatterns.FactoryMethod;

public class PizzaShopCF implements  IPizzaShop{

    @Override
    public PizzaFM createPizza(String type) {
        if(type.toUpperCase().equals("PEPERONI")){
            return new PizzaFM(8, "PEPERONI");
        }
        if(type.toUpperCase().equals("HAWAI")){
            return new PizzaFM(8, "HAWAI");
        }
        if(type.toUpperCase().equals("PEPERONI EXTRA CHEESE")){
            return new ExtraCheesePizza(12, "PEPERONI EXTRA CHEESE");
        }
        return null;
    }
}
