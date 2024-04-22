package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //Array can have any number
        //All numbers must be integers
        //They must be in order
        // Not negative numbers
        //No decimals


        int[] myArrayInt = {-4,-3,-2,1,2,3,4,5,6,7,11,22,33,44,55,66,67};

//        System.out.println("My binary Search: "+ BinarySearchTwo.doBinary(myArrayInt, 67));


//        double[] myArrayDou = {-4.4,-3.3,-2.3,1.3,2.3,3.3,4.3,5.3,6.3,7.3,11.3,22.3,33.3,44.3,55.3,66.3,67.3};
//        System.out.println("My binary Search: " + BinarySearch.ItemInList(myArrayDou,-2.3));
//        System.out.println("My binary Search: " + BinarySearch.ItemInList(myArrayInt,-2));

//        List<Integer> myList = Arrays.asList(1,2);
//
//        System.out.println("Icre Cream Parlo: "+ IceCreamParlo.icecreamParlorNow(4, myList));
//        System.out.println("Ice Cream Parlo: "+ IceCreamParlo.icecreamParlorNow2(3, myList));

//        List<Integer> myList2 = Arrays.asList(0,0,2);
//        System.out.println("Sherlock sucks: "+ SherlockAndArray.balancedSums(myList2) );
//        System.out.println("Sherlock sucks: "+ SherlockAndArray.balancedSumsThree(myList2) );

        List<Integer> myList3 = Arrays.asList(203);
        List<Integer> myList4 = Arrays.asList(206,204);

        System.out.println("Missing Num: "+ MissingNumbers.missingNumbersTwo(myList3,myList4));

    }
}