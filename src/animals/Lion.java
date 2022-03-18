package animals;

public class Lion extends Animal {

    private int age;
    private float weight;

    public Lion () {}

    public Lion(String type, int age, float weight){
        super(type, age, weight);
    }

    @Override
    public void say() {
        System.out.println("I am " + super.getType() + " and I will eat only meat");
    }
}