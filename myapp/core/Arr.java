package myapp.core;

public class Arr {
    public static void main(String[] args) {
        System.out.println("Program is running \n");

        for (int i = 0; i < args.length; i ++) {
            System.out.printf("index = %d \n", i);
        }
    }
}