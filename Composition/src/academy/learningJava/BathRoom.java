package academy.learningJava;

public class BathRoom {
    private boolean toilet;
    private boolean catBath;
    private Person personInBathRoom;

    public BathRoom(boolean toilet, boolean catBath, Person personInBathRoom) {
        this.toilet = toilet;
        this.catBath = catBath;
        this.personInBathRoom = personInBathRoom;
    }

    public boolean isToilet() {
        return toilet;
    }

    public boolean isCatBath() {
        return catBath;
    }

    public Person getPersonInBathRoom() {
        return personInBathRoom;
    }

}
