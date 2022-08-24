package OOP;

public class Main {

    public static void main(String[] args) {

        Jaguar myJaguar = new Jaguar(10, 120f);

        myJaguar.setAge(10);
        myJaguar.setWeight(20f);

        System.out.println(myJaguar);

        myJaguar.sleep();
        myJaguar.eat();

        myJaguar.hunt();
        myJaguar.roar();
       // myJaguar.meow();

        Jaguar segregation = new Jaguar();
        segregation.roar();
    }

}
