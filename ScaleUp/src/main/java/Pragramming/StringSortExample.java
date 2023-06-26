package Pragramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringSortExample {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> stringList = new ArrayList<>();
        stringList.add("banana");
        stringList.add("apple");
        stringList.add("orange");
        stringList.add("grape");

        // Print the unsorted list
        System.out.println("Unsorted List: " + stringList);

        // Sort the list in ascending order
        Collections.sort(stringList);

        // Print the sorted list
        System.out.println("Sorted List: " + stringList);
    }
}
