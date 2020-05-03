package academy.learningJava;

import javax.swing.plaf.IconUIResource;

public class Main {

    public static void main(String[] args) {
    Person whoInLivingRoom = new Person(false,false);
    Person whoInKitchen = new Person(true,true);
    Person whoInBathroom = new Person(false, false);


    LivingRoom livingRoom = new LivingRoom(true,whoInLivingRoom);
    BathRoom bathRoom = new BathRoom(true,true, whoInBathroom);
    Kitchen kitchen = new Kitchen(true,whoInKitchen);

    House house = new House(bathRoom,livingRoom,kitchen);

    house.whoInTheRoom();
    }
}
