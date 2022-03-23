package animals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Giraffe extends Animal implements IMove {

    private static final Logger LOGGER = LogManager.getLogger(Giraffe.class);

    public Giraffe () {}

    public Giraffe(String type, int age, float weight){
        super(type, age, weight);
    }

    @Override
    public void say() {
        LOGGER.info("I am " + super.getType() + " and I will eat only herbal");
    }

    public void move(){
        LOGGER.info("I can walk");
    }
}