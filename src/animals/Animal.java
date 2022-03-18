package animals;

public abstract class Animal {

    private String type;
    private boolean isEaten;
    private Aviary aviary;

    public Animal () {}

    public Animal(String type){
        this.type = type;
        isEaten = false;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isEaten() {
        return isEaten;
    }

    public void setEaten(boolean eaten) {
        isEaten = eaten;
    }

    public abstract void say();

    public void eat(Food food, String firstName) {
        String foodType = food.getType();
        int foodPortion = food.getPortion();

        if (isEaten) {
            System.out.println("Sorry, " + firstName + ", I was eaten already today");
        } else {
            if (type.equals("herbivore") && foodType.equals("Herbal")) {
                isEaten = true;
                food.setPortion(foodPortion - 1);
                System.out.println("Thank you, " + firstName + ", only " + food.getPortion() + " portions are left");
            } else if (type.equals("carnivore") && foodType.equals("Meat")) {
                isEaten = true;
                food.setPortion(foodPortion - 1);
                System.out.println("Thank you, " + firstName + ", only " + food.getPortion() + " portions are left");
            } else {
                System.out.println("Sorry, " + firstName + ", I don't eat this food");
            }
        }
    }

    public Aviary getAviary() {
        return aviary;
    }

    public void setAviary(Aviary aviary) {
        this.aviary = aviary;
    }
}