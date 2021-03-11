package bsu.comp152;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

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

        System.out.println("Loop through the indices to print group1:");
        for (int i = 0; i < group1.length; i++){
            System.out.println(group1[i]);
        }
        System.out.println();
        System.out.println("Loop through the indices to print group2:");
        for (int i = 0; i < group2.length; i++){
            System.out.println(group2[i]);
        }
        System.out.println();
        System.out.println("Overwrite elements of group2:");
        group2[0] = "Chris";
        group2[1] = "Jason";
        group2[2] = "Matthew";

        for (int i = 0; i < group2.length; i++){
            System.out.println(group2[i]);
        }
        System.out.println();
        for (String element : group2){
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

        System.out.println("Call add to populate the ArrayList with \"Joao\".");
        arrayList2.add("Joao");

        // We can also do this from the keyboard.
        Scanner console = new Scanner(System.in);
        System.out.print("Whom else would you like to add to the class? ");
        arrayList2.add(console.nextLine());
        System.out.println();

        System.out.println("The elements of arrayList2 are:");
        for (int i = 0; i < arrayList2.size(); i++) {
            // Call the size method on an ArrayList as needed.
            // Call get to return the element at index i.
            System.out.println(arrayList2.get(i));
        }
        System.out.println();

        System.out.println("Call set to overwrite the element at index 0.");
        arrayList2.set(0, "Alves");
        System.out.println();

        System.out.println("The elements of arrayList2 are:");
        for (int i = 0; i < arrayList2.size(); i++) {
            // Call get to return the element at index i.
            System.out.println(arrayList2.get(i));
        }
        System.out.println();

        System.out.println("We can also read from a file.");
        File myfile = new File("names001.txt");
        Scanner inputFile = new Scanner(myfile);
        while (inputFile.hasNext()){
            roster.add(inputFile.nextLine());
        }

        for (int i = 0; i < roster.size(); i++) {
            System.out.println(roster.get(i));
        }

    }
}
