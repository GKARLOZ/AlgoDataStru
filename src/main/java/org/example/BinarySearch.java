package org.example;

import java.util.List;

public class BinarySearch {

    private int[] listOfItems;
    private int chosen;

    public static int ItemInList(int[] listOfItems, int chosen) {

        //Array can have any number
        //All numbers must be integers
        //They must be in order


        int start = 0;
        int end = listOfItems.length - 1;
        int half = 0;

        while (start <= end) {

            half = start + (end - start) / 2;

            if (listOfItems[half] < chosen) {

                start = half + 1;

            } else if (listOfItems[half] > chosen) {

                end = half - 1;

            } else {

                return half;
            }

        }
        return 999;
    }
    public static int ItemInList(double[] listOfItems, double chosen) {

        //Array can have any number
        //All numbers must be integers
        //They must be in order


        int start = 0;
        int end = listOfItems.length - 1;
        int half = 0;

        while (start <= end) {

            half = start + (end - start) / 2;

            if (listOfItems[half] < chosen) {

                start = half + 1;

            } else if (listOfItems[half] > chosen) {

                end = half - 1;

            } else {

                return half;
            }

        }
        return 999;
    }
}
