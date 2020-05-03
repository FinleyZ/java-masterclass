package academy.learningJava;

public class Kitchen {
    private boolean stove;
    private Person PersonInKitchen;


    public Kitchen(boolean stove, Person personInKitchen) {
        this.stove = stove;
        PersonInKitchen = personInKitchen;
    }

    public boolean isStove() {
        return stove;
    }

    public Person getPersonInKitchen() {
        return PersonInKitchen;
    }
}
