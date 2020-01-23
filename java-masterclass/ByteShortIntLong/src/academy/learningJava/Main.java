package academy.learningJava;

public class Main {

    public static void main(String[] args) {
        int myValue = 1000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value " + myMinIntValue);
        System.out.println("Integer Maximum Value " + myMaxIntValue);

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value " + myMinByteValue);
        System.out.println("Byte Maximum Value " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value " + myMinShortValue);
        System.out.println("Short Maximum Value " + myMaxShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value " + myMinLongValue);
        System.out.println("Long Maximum Value " + myMaxLongValue);

        long bigLongLiteralValue = 2_147_483_647_198L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);
        //byte myNewByteValue = (myMinByteValue/2);
        //here is a error because java treated this variable as a int data type by default

        byte myNewByteValue = (byte) (myMinByteValue/2);//Thus, we use cast converting the number from int to byte
        //same thing here
        short myNewShortValue = (short) (myMinShortValue/2);


        //---------------------
        //Challenge
        byte myByte = 100;
        short myShort = 30000;
        int myInt = 500000000;
        long myLong = 50000 + (10 * (myByte + myShort + myInt));



    }
}
