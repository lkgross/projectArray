package bsu.comp152;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {

    /* Put throws FileNotFoundException in the header if you read from a
     * file in the method.
     */
    public static void main(String[] args) throws FileNotFoundException {
        String[] group1 = {"Connor", "Evan", "Sam"};
        String[] group3 = new String[10]; // Inline initialization
        String[] group2; // Separated declaration
        group2 = new String[10]; // and assignment

        System.out.println("What if we use println on an Array?");
        System.out.println(group1);
        System.out.println();
        System.out.println("Print group1:");
        printArray(group1);
        System.out.println();
        System.out.println("Print group2:");
        printArray(group2);
        System.out.println();
        System.out.println("Overwrite elements of group2:");
        group2[0] = "Chris";
        group2[1] = "Jason";
        group2[2] = "Matthew";

        printArray(group2);
        System.out.println();

        System.out.println("Loop through the elements to print group2:");
        System.out.println();
        for (String element : group2) {
            System.out.println(element);
        }
        System.out.println();

        /* Here are some situations where you have to loop through
         * the index values instead of the elements themselves (Tony Gaddis):
         * you need to change the contents of an array.
         * you need to work through the array elements in reverse order.
         * you need to access some of the array elements, but not all of them.
         * you need to work with two or more arrays within the loop at the same time.
         * you need to refer to the index value for a particular element.
         */

        /* Let's look at ArrayLists. *********************************
         * ***********************************************************
         * They are different from arrays.  They can expand and shrink.
         */
        // Here we declare and create an ArrayList roster to hold elements of type String.
        ArrayList<String> roster = new ArrayList<String>();

        // Note: An ArrayList can also be created with a parameterized constructor:
        ArrayList<String> arrayList2 = new ArrayList<String>(100);

        System.out.println("Call add to populate the ArrayList with \"Lilu\".");
        arrayList2.add("Lilu");

        // We can also do this from the keyboard.
        Scanner console = new Scanner(System.in);
        System.out.print("Whom else would you like to add to the class? ");
        arrayList2.add(console.nextLine());
        System.out.println();

        System.out.println("The elements of arrayList2 are:");
        System.out.println(arrayList2); // The ArrayList class has a toString method!

        System.out.println("Call set to overwrite the element at index 0.");
        arrayList2.set(0, "Bosari");

        System.out.println("The elements of arrayList2 are:");
        System.out.println(arrayList2);

        System.out.println("We can also read from a file.");
        File myfile = new File("names003");
        Scanner inputFile = new Scanner(myfile);
        while (inputFile.hasNext()) {
            roster.add(inputFile.nextLine());
        }
        System.out.println(roster);

        int numberNames = roster.size();
        Random rand = new Random();
        int randIndex = rand.nextInt(numberNames);
        System.out.printf("A random name is: %s", roster.get(randIndex));
    }

    /**
     * A method to loop through the indices to print the String elements of an Array arr
     * @param arr
     */
    public static void printArray(String[] arr){
        String str = "[" + arr[0];
        for (int i = 1; i < arr.length; i++) {
            str = str + ", " + arr[i];
        }
        System.out.println(str + "]");
    }
}
