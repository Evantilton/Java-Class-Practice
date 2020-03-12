package academy.learnprogramming;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimium Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted max value =" + (myMaxIntValue + 1));
        System.out.println("Busted min value =" + (myMinIntValue - 1));

        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("byte min val = " + myMinByteValue);
        System.out.println("byte max val = " + myMaxByteValue);


        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("short min val = " + myMinShortValue);
        System.out.println("short max val = " + myMaxShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("long min val = " + myMinLongValue);
        System.out.println("long max val = " + myMaxLongValue);
        long bigLongLiteralNumber = 2_147_483_647_234L;
        System.out.println(bigLongLiteralNumber);

        int myTotal = (myMinIntValue /2 );
        byte myNewByteType = (byte)(myMinByteValue / 2);

        short myNewShortValue = (short) (myMinShortValue / 2);
        

    }}
