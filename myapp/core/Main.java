// Package Declaration
package myapp.core;

public class Main {
    public static void main(String[] args) {
        System.out.println("good morning");
        
        //? Instantiate new array
        String[] todos = new String[3];

        todos[0] = "Learn Array";
        todos[1] = "Learn for-loops";
        todos[2] = "Learn while-loops";

        System.out.printf("Index: %d has the value of %s\n", 0, todos[0]);
        System.out.printf("Index: %d has the value of %s\n", 1, todos[1]);
        System.out.printf("Index: %d has the value of %s\n", 2, todos[2]);

        //? Print out length of array
        System.out.printf("Length of array = %d\n", todos.length);

        //? Print out length of args array
        System.out.printf("Length of Args array = %d\n", args.length);
        System.out.printf("Index: %d has the value of %s\n", 0, args[0]);
        System.out.printf("Index: %d has the value of %s\n", 1, args[1]);
    }
}