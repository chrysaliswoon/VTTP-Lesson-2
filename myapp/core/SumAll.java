package myapp.core;

public class SumAll {
    public static void main(String[] args) {

        //? Initialise new variable

        int sum = 0;

        for (int i = 0; i < args.length; i++) {
            sum += Integer.parseInt(args[i]);
        }

        System.out.printf("The sum is %d", sum);
    }
}