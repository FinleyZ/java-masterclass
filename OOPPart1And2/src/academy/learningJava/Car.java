package academy.learningJava;

public class  Car extends Vehicle{
    public int wheels;
    public int steering;


    public Car(int speed, int wheels, int steering){
        super(speed);
        System.out.println("Car is called");
    }

    public int getWheels() {
        return wheels;
    }

    public int getSteering() {
        return steering;
    }
}
