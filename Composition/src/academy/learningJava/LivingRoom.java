package academy.learningJava;

public class LivingRoom {
    private boolean sofa;
    private Person personInLivingRoom;

    public LivingRoom(boolean sofa, Person personInLivingRoom) {
        this.sofa = sofa;
        this.personInLivingRoom = personInLivingRoom;
    }

    public boolean isSofa() {
        return sofa;
    }

    public Person getPersonInLivingRoom() {
        return personInLivingRoom;
    }
}
