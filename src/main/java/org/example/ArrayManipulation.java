package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayManipulation {

    public static long arrayManipulation(int n, List<List<Integer>> queries) {

        Integer a;
        Integer b;
        Integer k;
        Integer max = 0;
        List<List<Integer>> myList = new ArrayList<>();
        myList.add(new ArrayList<>());
        for(int f = 0; f<n; f++){
            myList.get(0).add(0);
        }

        for(int i = 0; i < queries.size();i++){

            a = queries.get(i).get(0);
            b = queries.get(i).get(1);
            k = queries.get(i).get(2);
            myList.add(new ArrayList<>());
            Integer current;


            for(int q = 1; q <= n;q++){

                current = myList.get(i).get(q-1);
                if(q >= a && q <= b) {
                    myList.get(i + 1).add( current + k);
                    if((current+k) > max){
                        max = current+k;
                    }
                }else {
                    myList.get(i + 1).add(current);
                }
            }

        }

        System.out.println(myList);
        return max;

    }
    public static long arrayManipulationTwo(int n, List<List<Integer>> queries1){
        long[] arr = new long[n+1];
        int[][] queries = new int[queries1.size()][3];
        int i = 0;
        for (List<Integer> x : queries1) {
            queries[i++] = x.stream().mapToInt(Integer::intValue).toArray();
        }

        // add the value at first index
        // subtract the value at last index + 1
        for (int[] q : queries) {
            int start = q[0];
            int end = q[1];
            int amt = q[2];
            arr[start-1] += amt;
            arr[end] -= amt;
        }

        // max value and running sum
        long mv = -1;
        long running = 0;
        for (long a : arr) {
            running += a;
            if (running > mv) {
                mv = running;
            }
        }

        return mv;
    }

}
