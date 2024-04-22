package org.example;

import com.sun.source.tree.Tree;

import java.util.*;

public class MissingNumbers {


    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        Map<Integer, Integer> myMap = new HashMap<>();


        // Write your code here
        if(arr.size() < 1 || brr.size() < 1 || arr.size() > brr.size()){
            return null;

        }

        for (Integer num: brr ) {

            if(myMap.containsKey(num)){

                myMap.put(num, myMap.get(num)+1);
            }
            else {
                myMap.put(num, 1);
            }

        }
        System.out.println(myMap);

        for (Integer nBrr: arr) {

            if(myMap.containsKey(nBrr)){
                if(myMap.get(nBrr) > 1){
                    myMap.put(nBrr, myMap.get(nBrr) - 1);
                }
                else {
                    myMap.remove(nBrr);
                }

            }

        }

        System.out.println( myMap );
        return null;
    }



    public static List<Integer> missingNumbersTwo(List<Integer> arr, List<Integer> brr) {
        Map<Integer, Integer> myMap = new HashMap<>();
        List<Integer> myList = new ArrayList<>();



        // Write your code here
        if(arr.size() < 1 || brr.size() < 1 || arr.size() > brr.size()){
            return myList;

        }

        for (Integer num: arr ) {

            if(myMap.containsKey(num)){

                myMap.put(num, myMap.get(num)+1);
            }
            else {
                myMap.put(num, 1);
            }

        }
        for(Integer i : brr){

            if(myMap.containsKey(i)){
                    if(myMap.get(i) > 1){
                        myMap.put(i, myMap.get(i) - 1);
                    }
                    else {
                        myMap.remove(i);
                    }
                }
            else {
                myList.add(i);

            }

            }
        Collections.sort(myList);
        return myList;
    }
    public static List<Integer> missingNumbersThree(List<Integer> arr, List<Integer> brr){

        List<Integer> myList = new ArrayList<>();
        Integer min = Integer.MAX_VALUE;
        Integer[] theArr = new Integer[100];// the max and min can't be bigger than 100.

        for(Integer num: brr) {

            min = Math.min(num, min);
        }

        for(Integer n : brr){

            theArr[n - min]++;

        }

        for( Integer m : arr){

            theArr[m - min]--;

        }
        myList = Arrays.asList(theArr);
        return myList;
    }
}
