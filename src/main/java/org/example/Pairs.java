package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pairs {

//if number repeat use this method
    public static int pairs(int k, List<Integer> arr) {
        // Write your code here
        Map<Integer, Integer> subtraction = new HashMap<>();
        Integer x = null;
        int count = 0;

        for (Integer numbers:arr) {

            if(!subtraction.containsKey(numbers))
                subtraction.put(numbers,1);
            else
                subtraction.put(numbers,subtraction.get(numbers)+1);
        }

        for (Integer current : arr) {
            x = Math.abs(current - k);
            if (subtraction.containsKey(x)) {
                if (current.equals(x)) {
                    if (subtraction.get(x) > 1){
                        subtraction.put(x, subtraction.get(x) - 1);
                        count++;}
                }else{
                    count++;
                }
            }
        }



        return count;
    }
    //if numbers don't repeat, use this method.
    public static int pairs2(int k, List<Integer> arr) {
        // Write your code here
        Map<Integer, Integer> subtraction = new HashMap<>();
        Integer x = null;
        int count = 0;

        for (Integer numbers:arr) {
            subtraction.put(numbers,1);

        }

        for (Integer current : arr) {
            x = current - k;
            if(x > 0) {
                if (subtraction.containsKey(x) && !x.equals(current)) {
                    count++;
                }
            }
        }

        return count;
    }
}
