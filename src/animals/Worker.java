package animals;

public class Worker {
    private String firstName;
    private String lastName;
    private String position;

    public Worker() {
    }

    public Worker(String firstName, String lastName, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void giveMealToAnimal(Animal animal, Food food) {
        animal.eat(food, firstName);
    }

    public void changeAnimalAviary(Animal animal, Aviary aviary) {
        animal.setAviary(aviary);
    }
}