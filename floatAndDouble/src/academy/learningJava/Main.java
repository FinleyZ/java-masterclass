package academy.learningJava;

public class Main {

    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value is: " + myMinFloatValue);
        System.out.println("Float Maximum Value is: " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value is: " + myMinDoubleValue);
        System.out.println("Double Maximum Value is: " + myMaxDoubleValue);

        int myIntValue = 5/3;
        float myFloatValue = 5f/3f;
        double myDoubleValue = 5.00/3.00;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " +myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);
        //Challenge 1
        //Thinking back to our discussion on casting, which, if you recall, we used to convert an integer both back to a byte
        //and then again to a short, how do you think you'd do the same for the float to remove this error?

//        float myFloat = (float) 5.5;

        //Challenge 2
        //convert pound in kg

        double inPound = 200d;
        double pToKilo = inPound * 0.45359237d;
        System.out.println(inPound + "Pound Equal to " + pToKilo + " Kilogram");
    }
}
