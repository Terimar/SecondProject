package animals;

public class Tiger extends Animal {

    private int age;
    private float weight;

    public Tiger () {}

    public Tiger(String type, int age, float weight){
        super(type);
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
    public void say() {
        System.out.println("I am " + super.getType() + " and I will eat only meat");
    }
}