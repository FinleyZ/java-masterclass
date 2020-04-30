package academy.learningJava;


public class Main {


    public static void main(String[] args) {

//        SimpleCalculator a = new SimpleCalculator();
//        a.setFirstNumber(2.34);
//        System.out.println("first number is: "+ a.getFirstNumber());
//        a.setSecondNumber(0);
//        System.out.println("second number is: "+ a.getSecondNumber() );

        BankAccount b = new BankAccount("110",200,"name","123@gmail.123","123");

        b.setBalance(1000);
        System.out.println(b.getBalance());
        b.deposit(200);
        b.withdrawal(600);
    }
}
