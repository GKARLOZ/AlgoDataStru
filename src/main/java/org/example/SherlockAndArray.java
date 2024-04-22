package org.example;

import java.util.List;

public class SherlockAndArray {


    public static String balancedSums(List<Integer> arr){

        if(arr.size() < 2){
            return "NO";
        }
        Integer left = 0;
        Integer nuetral = 0;
        Integer right = 0;
        Integer temp = 0;

        for(int i = 0; i <= arr.size() - 1; i++){

            nuetral = arr.get(i);
            for(int j= i+1; j <= arr.size() -1; j++){

                temp = temp + arr.get(j);

            }
            right = temp;
            temp = 0;
            if(left.equals(right)){

                return "YES";

            }
            left = left + nuetral;

        }

        return "NO";
    }
    public static String balancedSumsTwo(List<Integer> arr){

        if(arr.size() < 2){
            return "NO";
        }
        Integer left = 0;
        Integer right = 0;
        Integer indexOfNuetral = 0;

        for(int i = 0; i < arr.size() - 1;i++){
            right = right + arr.get(i+1);

            if(right > left){

                left = left + arr.get(indexOfNuetral);
                indexOfNuetral = indexOfNuetral+1;

                right = right - arr.get(indexOfNuetral);

            }
            if(left == right){
                return "YES";
            }
        }
        return "NO";
    }

    //Out of memory
    public static String balancedSumsThree(List<Integer> arr){

        Integer total    = 0;
        Integer current  = 0;
        Integer leftSide = 0;

        if(arr.size() < 2){
            return "NO";
        }

        for (Integer i:arr) {

            total = total + i;

        }

        for(int i = 0; i < arr.size(); i++){
            current = arr.get(i);

            if(leftSide == total - (current + leftSide)){

                return "YES";

            }
            leftSide = leftSide + current;

        }
        return "NO";
    }




}
