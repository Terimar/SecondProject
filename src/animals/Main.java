package animals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashSet;
import java.util.Set;

public class Main {

    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        Food meat = new Food("Meat", 3);
        Food herbal = new Food("Herbal", 2);

        Aviary aviary1 = new Aviary(1);
        Aviary aviary2 = new Aviary(2);
        Aviary aviary3 = new Aviary(3);

        Worker worker = new Worker("Alex", "Smit", "worker");

        Animal lion = new Lion("carnivore", 5, 63.4f);
        Animal lion2 = new Lion("carnivore", 5, 63.4f);
        lion.setAviary(aviary1);
        LOGGER.info(lion);
        Animal zebra = new Zebra("herbivore", 3, 54.7f);
        zebra.setAviary(aviary2);
        LOGGER.info(zebra);
        Animal tiger = new Tiger("carnivore", 4, 66.5f);
        LOGGER.info(tiger);

        Zoo zoo = new Zoo("Zooland", 3);
        Set<Aviary> aviaries = new HashSet<>();
        aviaries.add(lion.getAviary());
        aviaries.add(zebra.getAviary());
        zoo.setAviaryList(aviaries);

        lion.say();
        zebra.say();

        lion.eat(meat);
        lion.eat(herbal);
        zebra.eat(meat);
        zebra.eat(herbal);

        LOGGER.info("Lion lives in the " + lion.getAviary().getId() + " cage");
        LOGGER.info("Zebra lives in the " + zebra.getAviary().getId() + " cage");
        LOGGER.info("Lets change their addresses");

        lion.setAviary(aviary3);
        zebra.setAviary(aviary1);

        LOGGER.info("Now Lion lives in the " + lion.getAviary().getId() + " cage");
        LOGGER.info("And Zebra lives in the " + zebra.getAviary().getId() + " cage");

        LOGGER.info(lion.hashCode());
        LOGGER.info(tiger.hashCode());
        LOGGER.info(zebra.hashCode());

        boolean isTwoLionAreTheSame = lion.equals(lion2);
        boolean isLionAndZebraAreTheSame = lion.equals(zebra);

        LOGGER.info("They say that in our zoo the same lion gets a double portion of food, " +
                "this is " + isTwoLionAreTheSame);
        LOGGER.info("and they also say that we don’t have a zebra, but we just painted a lion, " +
                "this is " + isLionAndZebraAreTheSame);
    }
}