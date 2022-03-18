package animals;

public class Tiger extends Animal {

    private int age;
    private float weight;

    public Tiger () {}

    public Tiger(String type, int age, float weight){
        super(type, age, weight);
    }

    @Override
    public void say() {
        System.out.println("I am " + super.getType() + " and I will eat only meat");
    }
}