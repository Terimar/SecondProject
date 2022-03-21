package animals;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Food meat = new Food("Meat", 3);
        Food herbal = new Food("Herbal", 2);

        Aviary aviary1 = new Aviary(1);
        Aviary aviary2 = new Aviary(2);
        Aviary aviary3 = new Aviary(3);

        Worker worker = new Worker("Alex", "Smit", "worker");

        Animal lion = new Lion("carnivore", 5, 63.4f);
        lion.setAviary(aviary1);
        System.out.println(lion);
        Animal zebra = new Zebra("herbivore", 3, 54.7f);
        zebra.setAviary(aviary2);
        System.out.println(zebra);
        Animal tiger = new Tiger("carnivore", 4, 66.5f);
        System.out.println(tiger);

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

        System.out.println("Lion lives in the " + lion.getAviary().getId() + " cage");
        System.out.println("Zebra lives in the " + zebra.getAviary().getId() + " cage");
        System.out.println("Lets change their addresses");

        lion.setAviary(aviary3);
        zebra.setAviary(aviary1);

        System.out.println("Now Lion lives in the " + lion.getAviary().getId() + " cage");
        System.out.println("And Zebra lives in the " + zebra.getAviary().getId() + " cage");
    }
}