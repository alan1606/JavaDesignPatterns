package OOP;

public class Jaguar extends Animal implements IFeline{
    private int age;
    private float weight;

    public Jaguar() {
        this.setAge(0);
        this.setWeight(0);
    }

    public Jaguar(int age) {
        this.age = age;
        this.setWeight(0f);
    }

    public Jaguar(float weight) {
        this.weight = weight;
        this.setAge(0);
    }

    public Jaguar(int age, float weight) {
        this.age = age;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return  "My age is = " + age +
                "\nMy weight = " + weight;
    }

    @Override
    public void roar() {
        System.out.println("Jaguar is roaring");
    }

    @Override
    public void meow() {
        throw new UnsupportedOperationException("Jaguar doesn't meow");
    }

    @Override
    public void hunt() {
        System.out.println("Jaguar is hunting");
    }

    @Override
    public void sleep() {
        System.out.println("Jaguar is sleeping");
    }

    @Override
    public void eat() {
        System.out.println("Jaguar is eating");
    }
}
