package org.example;

import java.util.*;

public class MaximumElement {

    public static List<Integer> getMax(List<String> operations) {
        List<Integer> myList = new Stack<>();
        String firstchar = null;
        Integer number  = null;

        if(operations.isEmpty()){
            return null;
        }


        for (String x:operations) {

            firstchar = x.substring(0,1);
            if(firstchar.equals(new String("1"))){
                number = Integer.parseInt(x.substring(2));
                myList.add(number);


            }
            else if(firstchar.equals(new String("2"))){

                myList.remove(myList.size()-1);


            }
//            else if(firstchar.equals(new String("3"))){
////                System.out.println(myQ.peek());
//            }


        }

    return myList;
    }


}
