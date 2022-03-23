package animals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Tiger extends Animal {

    private static final Logger LOGGER = LogManager.getLogger(Tiger.class);

    public Tiger () {}

    public Tiger(String type, int age, float weight){
        super(type, age, weight);
    }

    @Override
    public void say() {
        LOGGER.info("I am " + super.getType() + " and I will eat only meat");
    }

    @Override
    public String toString() {
        return "Tiger (type: " + super.getType() + ", age: " + super.getAge() + ", weight: " + super.getWeight() + ")";
    }
}