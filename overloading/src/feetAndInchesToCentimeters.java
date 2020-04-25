public class feetAndInchesToCentimeters {

    public static void main(String[] args) {
        double centimeters = calcFeetAndInchesToCentimeters(6.0D, 0.0D);
        if (centimeters < 0.0D) {
            System.out.println("Invalid parameters");
        }

        calcFeetAndInchesToCentimeters(157);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0.0D && inches >= 0.0D && inches <= 12.0D) {
            double centimeters = feet * 12.0D * 2.54D;
            centimeters += inches * 2.54D;
            System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
            return centimeters;
        } else {
            System.out.println("Invalid feet or inches parameters");
            return -1.0D;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0.0D) {
            return -1.0D;
        } else {
            double feet = (double)((int)inches / 12);
            double remainingInches = (double)((int)inches % 12);
            System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        }
    }
}