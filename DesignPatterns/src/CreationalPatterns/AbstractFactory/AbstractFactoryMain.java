package CreationalPatterns.AbstractFactory;

public class AbstractFactoryMain {
    public static void AbstractFactoryMain() {
        SamsungStore samsung = new SamsungStore();
        AppleStore apple = new AppleStore();

        IComputer mac = apple.createComputer();
        ITablet tablet = apple.createTablet();

        IComputer qx = samsung.createComputer();
        ITablet s3 = samsung.createTablet();

        System.out.println("Every store creates their own pcs and tablets");
    }
}
