package animals;

import animals.exceptions.AgeWrongException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Giraffe extends Animal implements IMove, AutoCloseable {

    private static final Logger LOGGER = LogManager.getLogger(Giraffe.class);

    public Giraffe() {
    }

    public Giraffe(String type, int age, float weight) {
        super(type, age, weight);
    }

    @Override
    public void say() {
        LOGGER.info("I am " + super.getType() + " and I will eat only herbal");
    }

    public void move() throws AgeWrongException {
        int giraffeAge = getAge();
        if (giraffeAge > 50) {
            LOGGER.error("Usually giraffe lives less than 50 years");
            throw new AgeWrongException("It seems like age is wrong");
        }
        try {
            if (giraffeAge < 2) {
                throw new AgeWrongException("I can't walk without mummy");
            } else {
                LOGGER.info("I can walk on my own");
            }
        } catch (AgeWrongException e) {
            LOGGER.error("I need to grow up");
        }
    }

    @Override
    public void close() throws Exception {
        System.out.println("fbdfb");
    }
}