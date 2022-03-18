package animals;

public class Zebra extends Animal {

    public Zebra() {}

    public Zebra(String type, int age, float weight){
        super(type, age, weight);
    }

    @Override
    public void say() {
        System.out.println("I am " + super.getType() + " and I will eat only herbal");
    }
}