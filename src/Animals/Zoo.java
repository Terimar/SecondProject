package Animals;

import java.util.Set;

public class Zoo {
    private String name;
    private int cage;
    private Set<Aviary> aviaryList;

    public Zoo () {}

    public Zoo(String name, int cage, Set<Aviary> aviaryList) {
        this.name = name;
        this.cage = cage;
        this.aviaryList = aviaryList;
    }

    public Zoo(String name, int cage) {
        this.name = name;
        this.cage = cage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCage() {
        return cage;
    }

    public void setCage(int cage) {
        this.cage = cage;
    }

    public int getCountOfAvailableAviaries() {
        int aviariesCount = 0;
        if (!aviaryList.isEmpty()) {
            aviariesCount = aviaryList.size();
        }
        int freeAviariesCount = cage - aviariesCount;
        System.out.println("At this moment there are only " + freeAviariesCount + " free cages");
        return freeAviariesCount;
    }

    public Set<Aviary> getAviaryList() {
        return aviaryList;
    }

    public void setAviaryList(Set<Aviary> aviaries) {
        this.aviaryList = aviaries;

    }
}