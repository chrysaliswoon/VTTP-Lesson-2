package myapp.core;

import java.util.*;

public class DataStructure {
    public static void main(String[] args) {

        //? Create a list of integers
        List<Integer> intList = new LinkedList<Integer>();
        intList.add(42);
        intList.add(10);
        intList.add(50);
        intList.add(2, 15);

        System.out.println(intList);

        //? To iterate through the list
        for (int i = 0; i < intList.size(); i++) {
            System.out.printf("%d = %d \n", i, intList.get(i));
        }



    }
}