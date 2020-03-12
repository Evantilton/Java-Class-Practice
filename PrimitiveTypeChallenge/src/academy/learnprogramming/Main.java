package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        //challenge
        byte byteVar = 1;
        short shortVar = 1;
        int intVar = 1;
        long longVar = 50000L + (10L * (byteVar + shortVar + intVar));
        System.out.println(longVar);

        short shortTotal = (short) (1000 + 10 *
                        (byteVar + shortVar + intVar));
    }
}
