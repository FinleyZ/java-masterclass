package academy.learningJava;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int perviousResult = result;
        System.out.println("perviousResult = " + perviousResult);
        result = result - 1;
        System.out.println("3 - 1 =  " + result);
        System.out.println("perviousResult = " + perviousResult);

        result = result * 10; //2 * 10 = 20
        System.out.println("2 * 10 =" + result);

        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3; // the reminder of (4 % 3 = 1)
        System.out.println("4 % 3 = " + result);

        result++; //result + 1, as same as result --
        result--;

        result +=  2; //1 + 2 = 3
        System.out.println("1 + 2 = " + result );

        boolean isAlien = false;
        if(isAlien == false) {
            System.out.println("It is not an Alien");
            System.out.println("I am scared of Alien");
        }

        int topScore = 80;
        if (topScore <100){
            System.out.println("You got a high score");
        }
        int secondTopScore = 81;
        if((topScore>secondTopScore) && (topScore < 100)){
            System.out.println("Greater than second top score and less than 100 ");
        }

        int newValue = 50;
        if(newValue ==50){
            System.out.println("This is an error... ");
        }

        boolean isCar = false;
        if (isCar){
            System.out.println("This is not suppose to happen..");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar){
            System.out.println("wasCar is true.");
        }

        //operator Challenge

        double a = 40.00d;
        double b = 80.00d;
        double c = (a + b) * 100.00d;
        double d = c % 40.00;
        boolean ifTrue = (d==0) ? true : false;
        System.out.println(ifTrue);
        if(!ifTrue)
            System.out.println("Got some reminder");






    }
}
