package animals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Lion extends Animal {

    private static final Logger LOGGER = LogManager.getLogger(Lion.class);

    public Lion () {}

    public Lion(String type, int age, float weight){
        super(type, age, weight);
    }

    @Override
    public void say() {
        LOGGER.info("I am " + super.getType() + " and I will eat only meat");
    }

    @Override
    public String toString() {
        return "Lion (type: " + super.getType() + ", age: " + super.getAge() + ", weight: " + super.getWeight() + ")";
    }
}