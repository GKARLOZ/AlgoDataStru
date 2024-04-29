package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SparseArrays {



    public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
        // Write your code here
        Map<String,Integer> myMap = new HashMap<>();
        List<Integer> myList = new ArrayList<>();


        if(stringList.size() < 1 || stringList.size() > 1000){
            System.out.println("Stringlist to small or to big");
            return null;
        }
        if(queries.size() < 1 || queries.size() > 1000){
            System.out.println("Queries to small or to big");
            return null;
        }

        for (String x: stringList ) {

            if(!myMap.containsKey(x)){
                myMap.put(x,1);
            }else{
                myMap.put(x,myMap.get(x)+1);

            }
        }
        for (String z:queries) {

            if(myMap.containsKey(z)){
                myList.add(myMap.get(z));
            }else{
                myList.add(0);
            }
        }

        return myList;

    }

}
