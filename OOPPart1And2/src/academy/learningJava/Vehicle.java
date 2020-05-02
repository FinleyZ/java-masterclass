package academy.learningJava;

public class Vehicle {
    private int speed;


    public Vehicle(int speed){
        this.speed = speed;
        System.out.println("Vehicle() is called");
    }

    public void getSpeed() {
        System.out.println("Vehicle. getSpeed is called. The speed is: " + speed);
    }
}

