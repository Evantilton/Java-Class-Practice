package academy.learnprogramming;

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
    }}
