package academy.learningJava;

public class Main {

    public static void main(String[] args) {
        // byte
        //short
        //int
        //long
        //float
        //char
        //boolean
        String myString = "This is a string";
        System.out.println("mySting is equal to: " + myString);
        myString = myString + ", and this is more.";
        System.out.println("mySting is equal to: " + myString);
        myString = myString + "\u00A9 2020";
        System.out.println("mySting is equal to: " + myString);

        String numString = "49. ";
        numString = numString + "26.3";
        System.out.println(numString);

        String lastString = "10";
        int myInt = 50;

        lastString = lastString + myInt;
        System.out.println("lastString is equal to: " + lastString );
        double myDouble = 120.66d;
        lastString = lastString + myDouble;
        System.out.println("lastString is equal to: " + lastString );




    }
}
