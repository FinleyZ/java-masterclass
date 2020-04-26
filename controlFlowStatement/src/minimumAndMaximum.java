import java.util.Scanner;

public class minimumAndMaximum {
//-Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
//-Before the user enters the number, print the message ÅgEnter number:Åh
//-If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
//
//Hint:
//-Use an endless while loop.
//
//Bonus:
//-Create a project with the name MinAndMaxInputChallenge.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int min = 0;// or set then to max int value
        boolean firstNumber = true;

        while (true){
            System.out.println("Enter number: ");
            boolean hasNextInt = scanner.hasNextInt();

            if(hasNextInt){
                int number = scanner.nextInt();

                if(firstNumber){
                    firstNumber = false;
                    max = number;
                    min = number;
                }
                if(number>=max){
                    max = number;
                }
                if (number < min) {
                    min = number;
                }

            }else{
                break;
            }
            scanner.nextLine();
        }
        System.out.println("maximum: "+ max + "， minimum：" + min);
        scanner.close();
    }
}
