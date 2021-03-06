package animals;

import animals.exceptions.AgeWrongException;
import animals.exceptions.LimitAviaryException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public class Main {

    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) throws AgeWrongException, LimitAviaryException {
        Food meat = new Food("Meat", 3);
        Food herbal = new Food("Herbal", 2);

  //      Worker worker = new Worker("Alex", "Smith", "worker");

        Animal lion = new Lion(1, "carnivore", 5, 63.4f);
        Animal lion2 = new Lion(2, "carnivore", 5, 63.4f);
        LOGGER.info(lion);
        Animal zebra = new Zebra(3, "herbivore", 3, 54.7f);
        LOGGER.info(zebra);
        Animal tiger = new Tiger(4, "carnivore", 4, 66.5f);
        LOGGER.info(tiger);
        Map<String, Animal> animals = new HashMap<>();
        animals.put("AlexLion", lion);
        animals.put("BobLion", lion2);
        animals.put("BigCat", tiger);
        animals.put("KsushaZebra", zebra);
        Animal alex = animals.get("AlexLion");


        Aviary aviary1 = new Aviary(1, lion);
        Aviary aviary2 = new Aviary(2, zebra);
        Aviary aviary3 = new Aviary(3);
        Aviary aviary4 = new Aviary(4, tiger);
        Aviary aviary5 = new Aviary(5, lion2);

        Set<Aviary> aviaries = Set.of(aviary1, aviary2, aviary3, aviary4, aviary5);

        Zoo zoo = new Zoo("Zooland", 10);

        Set<Aviary> freeAviaries = new HashSet<>();
        for (Aviary aviary : aviaries) {
            if (aviary.getAnimal() == null) {
                freeAviaries.add(aviary);
            }
        }

        zoo.setAviaryList(aviaries);
        LOGGER.info("you have " + freeAviaries.size() + " free aviaries");

        lion.say();
        zebra.say();

        lion.eat(meat);
        lion.eat(herbal);
        zebra.eat(meat);
        zebra.eat(herbal);

        aviary3.setAnimal(lion);
        aviary1.setAnimal(zebra);
        LOGGER.info("Lion lives in third aviary, zebra in first");
        LOGGER.info("Lets make it vice versa");
        changeAviaries(aviary1, aviary2);

        LOGGER.info(lion.hashCode());
        LOGGER.info(tiger.hashCode());
        LOGGER.info(zebra.hashCode());

        boolean isTwoLionAreTheSame = lion.equals(lion2);
        boolean isLionAndZebraAreTheSame = lion.equals(zebra);

        LOGGER.info("They say that in our zoo the same lion gets a double portion of food, " +
                "this is " + isTwoLionAreTheSame);
        LOGGER.info("and they also say that we don???t have a zebra, but we just painted a lion, " +
                "this is " + isLionAndZebraAreTheSame);

        Giraffe giraffe = new Giraffe(5, "herbivore", 5, 52.7f);
        giraffe.move();
        // if age of giraffe will be less than 2 years then AgeWrongException will be caught
        Giraffe giraffeYoung = new Giraffe(6, "herbivore", 1, 15.9f);
        giraffeYoung.move();
        // if age of giraffe will be more than 50 years then AgeWrongException will be thrown
        // (because they life period is usually less then 35-40 years)
        Giraffe giraffeOld = new Giraffe(7, "herbivore", 51, 62.5f);
        giraffeOld.move();
    }

    public static void changeAviaries(Aviary a, Aviary b) {
        Animal dsc = a.getAnimal();
        a.setAnimal(b.getAnimal());
        b.setAnimal(dsc);
    }
}