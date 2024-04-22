package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IceCreamParlo {


    public static List<Integer> icecreamParlorNow(int m, List<Integer> arr) {
        // Write your code here
        List<Integer> finalList = new ArrayList<>();
        finalList.add(0);
        finalList.add(0);

        for(int i = 0; i < arr.size(); i++){

            for(int j = (i+1); j < arr.size(); j++){

                if(arr.get(i) + arr.get(j) == m){
                    finalList.set(0,i+1);
                    finalList.set(1,j+1);
                }

            }

        }
        return finalList;
    }
    public static List<Integer> icecreamParlorNow2(int m, List<Integer> arr) {
        //Time complexity of 0(N)
        //return a arrayList
        List<Integer> finalArr = new ArrayList<>();

        //return a hashmap
        Map<Integer, Integer> possibilities = new HashMap<>();

        for(int i = 0; i <= arr.size() - 1; i++){

            Integer current = arr.get(i);
            Integer need = m - current;

            if(possibilities.containsKey(need)){

                finalArr.add(possibilities.get(need) + 1);
                finalArr.add(i+1);
                break;
            }
            possibilities.put(current, i);

        }


        return finalArr;


    }



    }
