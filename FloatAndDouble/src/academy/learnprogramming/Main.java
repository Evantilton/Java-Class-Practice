package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here

        float floatMin = Float.MIN_VALUE;
        float floatMax = Float.MAX_VALUE;
        double doubleMin = Double.MIN_VALUE;
        double doubleMax = Double.MAX_VALUE;
        System.out.println("float min val =" + floatMin);
        System.out.println("float max val =" + floatMax);
        System.out.println("double min val =" + doubleMin);
        System.out.println("double min val =" + doubleMax);

        int myIntVal = 5 / 3;
        float myFloatVal = 5f / 3f;
        double myDoubleVal = 5.00 / 3.00;

        System.out.println("myIntVal + " + myIntVal);
        System.out.println("myFloatVal + " + myFloatVal);
        System.out.println("myDoubleVal + " + myDoubleVal);


        //challenge
        int pounds = 200;
        double kiloConvert = 0.45359237d;
        double kiloTotal = pounds * kiloConvert;
        System.out.println("kiloTotal + " + kiloTotal);
    }
}
