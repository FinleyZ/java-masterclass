package academy.learningJava;

public class Ford extends Car{
    public String engine= "V6";

    public Ford(int speed, int wheels, int steering, String engine) {
        super(speed, wheels, steering);
        this.engine = engine;
        System.out.println("Ford() is called");
    }

    public String getEngine() {
        return engine;
    }

    @Override
    public void getSpeed() {
        super.getSpeed();
        System.out.println("Ford.getSpeed is called");


    }
}

