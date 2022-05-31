package myapp.core;
import java.io.Console;

public class WhileLoop {
    public static void main(String[] args) {
        Console cons = System.console();

        String init = "50";
        int toAdd = 0;

        while (init.length() > 0) {
            init = cons.readLine("Enter an integer, blank to end: ");

            if(! init.equals("")) {
                toAdd += Integer.parseInt(init);
            }
        }
        System.out.printf("The sum is %d", toAdd);
    }
}